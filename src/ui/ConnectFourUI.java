package ui;

import connectfour.ConnectFour;

import java.io.*;

public class ConnectFourUI {
    private static final String PRINT = "print";
    private static final String EXIT = "exit";
    private static final String CONNECT = "connect";
    private static final String OPEN = "open";
    private static final String INSERT = "insert";
    private static final int DEFAULT_COLUMNS = 7;
    private static final int DEFAULT_ROWS = 6;
    private final PrintStream outStream;
    private final BufferedReader inBufferedReader;
    private final ConnectFour gameEngine;
    private String partnerName;

    public static void main(String[] args) {
        System.out.println("Welcome to Connect Four version 0.1");

        if (args.length < 1) {
            System.err.println("need playerName as parameter");
            System.exit(1);
        }

        System.out.println("Welcome " + args[0]);
        System.out.println("Let's play a game");

        ConnectFourUI userCmd = new ConnectFourUI(args[0], System.out, System.in);

        userCmd.printUsage();
        userCmd.runCommandLoop();
    }

    public ConnectFourUI(String playerName, PrintStream os, InputStream is) {
        this.outStream = os;
        this.inBufferedReader = new BufferedReader(new InputStreamReader(is));

        this.gameEngine = new ConnectFour(DEFAULT_COLUMNS, DEFAULT_ROWS);
    }

    public void printUsage() {

        String b = "\n" +
                "\n" +
                "valid commands:" +
                "\n" +
                CONNECT +
                ".. connect as tcp client" +
                "\n" +
                OPEN +
                ".. open port become tcp server" +
                "\n" +
                PRINT +
                ".. print board" +
                "\n" +
                INSERT +
                ".. insert a piece" +
                "\n" +
                EXIT +
                ".. exit";

        this.outStream.println(b);
    }

    public void runCommandLoop() {
        boolean again = true;

        while (again) {
            String cmdLineString;

            try {
                // read user input
                cmdLineString = inBufferedReader.readLine();

                // finish that loop if less than nothing came in
                if (cmdLineString == null) break;

                // trim whitespaces on both sides
                cmdLineString = cmdLineString.trim();

                // extract command
                int spaceIndex = cmdLineString.indexOf(' ');
                spaceIndex = spaceIndex != -1 ? spaceIndex : cmdLineString.length();

                // got command string
                String commandString = cmdLineString.substring(0, spaceIndex);

                // extract parameters string - can be empty

                // start command loop
                switch (commandString) {
                    case PRINT -> this.doPrint();
                    case CONNECT -> this.doConnect();
                    case OPEN -> this.doOpen();
                    case INSERT -> {
                        this.doSet();
                        // redraw
                        this.doPrint();
                    } // convenience
                    case "q", EXIT -> {
                        again = false;
                        this.doExit();
                    } // end loop

                    default -> {
                        this.outStream.println("unknown command:" + cmdLineString);
                        this.printUsage();
                    }
                }
            } catch (IOException ex) {
                this.outStream.println("cannot read from input stream - fatal, give up");
                try {
                    this.doExit();
                } catch (IOException e) {
                    // ignore
                }
            }  catch (RuntimeException ex) {
                this.outStream.println("runtime problems: " + ex.getLocalizedMessage());
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                           ui method implementations                                        //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void doSet() {
        // call guards
        this.checkConnnectionStatus();

    }

    private void doExit() throws IOException {
        // shutdown engines which needs to be

    }

    private void doOpen() {

    }

    private void doConnect() {

    }

    private void doPrint() throws IOException {

        this.gameEngine.getPrintStreamView().print(System.out);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                  guards                                                    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Guard method - checks if already connected
     */
    private void checkConnnectionStatus() {
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                       helper: don't repeat yourself                                        //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                              listener                                                      //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}