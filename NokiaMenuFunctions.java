import java.util.Scanner;

public class NokiaMenuFunctions {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        String menu = """
                Menu Functions
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services
                """;

        System.out.println(menu);
        System.out.print("Enter a menu number: ");
        int generalMenuFunctions = inputCollector.nextInt();

        switch (generalMenuFunctions) {

            case 1 -> {
                System.out.println("PHONEBOOK");

                String phoneBook = """
                        Press 1 - Search
                        Press 2 - Service Nos. 1
                        Press 3 - Add name
                        Press 4 - Erase
                        Press 5 - Edit
                        Press 6 - Assign tone
                        Press 7 - Send b’card
                        Press 8 - Options
                        Press 9 - Speed dials
                        Press 10 - Voice tags
                        """;

                System.out.println(phoneBook);

                System.out.print("Select a Phonebook option: ");
                int phonebookOption = inputCollector.nextInt();

                switch (phonebookOption) {

                    case 8 -> {
                        System.out.println("Options");

                        String optionsMenu = """
                                1. Type of view
                                2. Memory status
                                """;

                        System.out.println(optionsMenu);
                    }

                    default -> System.out.println("Submenu not implemented yet.");
                }
            }

            case 2 -> {
                System.out.println("Messages");

                String messages = """
                        Press 1 - Write Messages
                        Press 2 - Inbox
                        Press 3 - Outbox
                        Press 4 - Picture Messages
                        Press 5 - Templates
                        Press 6 - Smileys
                        Press 7 - Message Settings
                        Press 8 - Info service
                        Press 9 - Voice mailbox number
                        Press 10 - Service command editor
                        """;

                System.out.println(messages);

                System.out.print("Select a Messages option: ");
                int messagesOption = inputCollector.nextInt();

                switch (messagesOption) {

                    case 7 -> {
                        System.out.println("Message Settings");

                        String msgSettingsMenu = """
                                1. Set
                                2. Common
                                """;

                        System.out.println(msgSettingsMenu);

                        System.out.print("Choose a Message Settings option: ");
                        int msgSettingsChoice = inputCollector.nextInt();

                        switch (msgSettingsChoice) {

                            case 1 -> {
                                System.out.println("Set");

                                String setMenu = """
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        """;

                                System.out.println(setMenu);
                            }

                            case 2 -> {
                                System.out.println("Common");

                                String commonMenu = """
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """;

                                System.out.println(commonMenu);
                            }

                            default -> System.out.println("Invalid option inside Message Settings.");
                        }
                    }

                    default -> System.out.println("Submenu not implemented yet.");
                }
            }

            case 3 -> System.out.println("Chat");

            case 4 -> {
                System.out.println("Call register");

                String callRegister = """
                        Press 1 - Missed calls
                        Press 2 - Received calls
                        Press 3 - Dialled calls
                        Press 4 - Erase recent call lists
                        Press 5 - Show call duration
                        Press 6 - Show call costs
                        Press 7 - Call cost settings
                        Press 8 - Prepaid credit
                        """;

                System.out.println(callRegister);

                System.out.print("Select a Call Register option: ");
                int callRegisterOption = inputCollector.nextInt();

                switch (callRegisterOption) {

                    case 5 -> {
                        System.out.println("Show Call Duration");

                        String durationMenu = """
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """;

                        System.out.println(durationMenu);
                    }

                    case 6 -> {
                        System.out.println("Show Call Costs");

                        String costMenu = """
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """;

                        System.out.println(costMenu);
                    }

                    case 7 -> {
                        System.out.println("Call Cost Settings");

                        String costSettings = """
                                1. Call cost limit
                                2. Show costs in
                                """;

                        System.out.println(costSettings);
                    }

                    default -> System.out.println("Submenu not implemented yet.");
                }
            }

            case 5 -> {
                System.out.println("Tones");

                String tones = """
                        Press 1 - Ringing tone
                        Press 2 - Ringing volume
                        Press 3 - Incoming call alert
                        Press 4 - Composer
                        Press 5 - Message alert tone
                        Press 6 - Keypad tones
                        Press 7 - Warning and game tones
                        Press 8 - Vibrating alert
                        Press 9 - Screen saver
                        """;

                System.out.println(tones);
            }

            case 6 -> {
                System.out.println("Settings");

                String settings = """
                        Press 1 - Call settings
                        Press 2 - Phone settings
                        Press 3 - Security settings
                        Press 4 - Restore factory settings
                        """;

                System.out.println(settings);

                System.out.print("Choose a Settings option: ");
                int settingsOption = inputCollector.nextInt();

                switch (settingsOption) {

                    case 1 -> {
                        System.out.println("Call Settings");

                        String callSettings = """
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """;

                        System.out.println(callSettings);
                    }

                    case 2 -> {
                        System.out.println("Phone Settings");

                        String phoneSettings = """
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """;

                        System.out.println(phoneSettings);
                    }

                    case 3 -> {
                        System.out.println("Security Settings");

                        String securitySettings = """
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """;

                        System.out.println(securitySettings);
                    }

                    case 4 -> System.out.println("Restore Factory Settings");

                    default -> System.out.println("Invalid option inside Settings.");
                }
            }

            case 7 -> System.out.println("Call divert");

            case 8 -> System.out.println("Games");

            case 9 -> System.out.println("Calculator");

            case 10 -> System.out.println("Reminders");

            case 11 -> {
                System.out.println("Clock");

                String clock = """
                        Press 1 - Alarm clock
                        Press 2 - Clock settings
                        Press 3 - Date setting
                        Press 4 - Stopwatch
                        Press 5 - Countdown timer
                        Press 6 - Auto update of date and time
                        """;

                System.out.println(clock);
            }

            case 12 -> System.out.println("Profiles");

            case 13 -> System.out.println("SIM services");

            default -> System.out.println("Invalid Menu Option!");

        }
    }
}

