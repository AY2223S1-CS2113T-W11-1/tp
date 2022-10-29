package seedu.moneygowhere.common;

import seedu.moneygowhere.parser.ConsoleParserConfigurations;

/**
 * Defines the messages used by program.
 */
public class Messages {
    //@@author xzynos
    //region Defines messages for ConsoleInterface
    public static final String CONSOLE_MESSAGE_GREETING = ""
            + "Your MoneyGoWhere? Let me help you track it.";
    public static final String CONSOLE_MESSAGE_GOODBYE = ""
            + "Bye. Hope to see you again soon!";

    //endregion

    //@@author xzynos
    //region Defines messages for ConsoleParser
    public static final String CONSOLE_ERROR_COMMAND_NOT_FOUND = ""
            + "The command entered is invalid.";

    //endregion

    //@@author xzynos
    //region Defines messages for ExpenseManager
    public static final String EXPENSE_MANAGER_ERROR_EXPENSE_NOT_FOUND = ""
            + "The expense is not found.";
    public static final String EXPENSE_MANAGER_ERROR_DUPLICATE_EXPENSE = ""
            + "There is already a similar expense";

    //endregion

    //@@author penguin-s
    //region Defines messages for TargetManager
    public static final String TARGET_MANAGER_ERROR_TARGET_NOT_FOUND = ""
            + "The target is not found.";

    //endregion

    //@@author penguin-s
    //region Defines messages for IncomeManager
    public static final String INCOME_MANAGER_ERROR_INCOME_NOT_FOUND = ""
            + "The income is not found.";

    //endregion

    //@@author xzynos
    //region Defines messages for RecurringPaymentManager
    public static final String RECURRING_PAYMENT_MANAGER_ERROR_RECURRING_PAYMENT_NOT_FOUND = ""
            + "The recurring payment is not found.";

    //endregion

    //@@author jeyvia
    //region Defines messages for LocalStorage
    public static final String LOCAL_STORAGE_ERROR_NO_LOAD_FILE = ""
            + "There is no load file found...\n"
            + "Please ensure the file is named correctly and "
            + "is in the right directory if you have a load file.";
    public static final String LOCAL_STORAGE_ERROR_CORRUPTED_OR_EMPTY_LOAD_FILE = ""
            + "The load file is empty or corrupted...\n"
            + "Please ensure the load file is not modified if you have a load file.";
    public static final String LOCAL_STORAGE_ERROR_INVALID_CHARACTER_IN_SAVE_DATA = ""
            + "There is an invalid character in the inputs\n"
            + "Failed to save data.";
    public static final String LOCAL_STORAGE_EXPENSE_ERROR_IN_LOAD_FILE = ""
            + "There is an error in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.\n"
            + "Error is found in expense id: ";
    public static final String LOCAL_STORAGE_RECURRING_PAYMENT_ERROR_IN_LOAD_FILE = ""
            + "There is an error in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.\n"
            + "Error is found in Recurring Payment id: ";
    public static final String LOCAL_STORAGE_TARGET_ERROR_IN_LOAD_FILE = ""
            + "There is an error in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.\n"
            + "Error is found in Recurring Payment id: ";
    public static final String LOCAL_STORAGE_INCOME_ERROR_IN_LOAD_FILE = ""
            + "There is an error in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.\n"
            + "Error is found in Recurring Payment id: ";
    public static final String LOCAL_STORAGE_SORTCONFIG_ERROR_IN_LOAD_FILE = ""
            + "There is no sorting configuration in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.";
    public static final String LOCAL_STORAGE_MESSAGE_LOAD_SUCCESS = ""
            + "File loaded successfully :)";
    public static final String LOCAL_STORAGE_ERROR_SAVE_DATA = ""
            + "There is an error in saving file...\n"
            + "File does not exist or Path is wrong :(";
    public static final String LOCAL_STORAGE_ERROR_WRITING_DATA = ""
            + "There is an error in writing data to save file.";
    public static final String LOCAL_STORAGE_MESSAGE_MERGE_FILE_SUCCESS = ""
            + "External File loaded successfully :)";
    public static final String LOCAL_STORAGE_MERGE_FILE_ERROR_WRONG_FILE_FORMAT = ""
            + "Wrong file format given\n"
            + "Please provide path to your xml file with the save data.";

    //endregion

    //@@author jeyvia
    //region Defines messages for CurrencyApi
    public static final String CURRENCY_API_ERROR_CONNECTION_FAILURE = ""
            + "Unable to connect to CurrencyAPI...\n"
            + "Using last saved currencies instead.";
    public static final String CURRENCY_STORAGE_ERROR_NO_LOAD_FILE = ""
            + "There is no currencies file found...\n"
            + "Please ensure the file is named correctly and is in the right directory if you have a currencies file.";
    public static final String CURRENCY_STORAGE_ERROR_IN_LOAD_FILE = ""
            + "There is an error in currencies file found...\n"
            + "Please ensure the file is the correct currencies file without modifications to it.\n"
            + "Error is found in line: ";
    public static final String CURRENCY_API_MESSAGE_LOAD_SUCCESS = ""
            + "Currencies loaded successfully :)";

    //endregion

    //@@author jeyvia
    //region Defines messages for CurrencyManager
    public static final String CURRENCY_MANAGER_ERROR_RATES_NOT_FOUND = ""
            + "There may be an error obtaining the updated Exchange Rate for your desired currency. " + '\n'
            + "Please enter the exchange rate manually.";
    public static final String CURRENCY_MANAGER_ERROR_CURRENCY_NOT_FOUND = ""
            + "Currency not found. Please try again.";

    //endregion

    //@@author xzynos
    //region Defines messages for console command Add-Expense
    public static final String CONSOLE_COMMAND_ADD_EXPENSE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_NAME_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_AMOUNT_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_CATEGORY
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_CATEGORY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_REMARKS
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_REMARKS_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_CURRENCY
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_CURRENCY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_MODE_OF_PAYMENT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_EXPENSE_ARG_MODE_OF_PAYMENT_DESC
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_EXPENSE_SUCCESS = ""
            + "The expense was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_ADD_EXPENSE_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command View-Expense
    public static final String CONSOLE_COMMAND_VIEW_EXPENSE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE
            + " [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_INDEX_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_CATEGORY
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_CATEGORY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_EXPENSE_ARG_EXPENSE_NAME_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_ERROR_COMMAND_VIEW_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_VIEW_EXPENSE_SYNTAX;
    public static final String COMMAND_VIEW_EXPENSE_EMPTY_LIST = ""
            + "Your list of expenses is empty. ";

    //endregion

    //@@author xzynos
    //region Defines messages for console command Delete-Expense
    public static final String CONSOLE_COMMAND_DELETE_EXPENSE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_DELETE_EXPENSE
            + " -"
            + ConsoleParserConfigurations.COMMAND_DELETE_EXPENSE_ARG_EXPENSE_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_DELETE_EXPENSE_ARG_EXPENSE_INDEX_LONG.toUpperCase();
    public static final String CONSOLE_MESSAGE_COMMAND_DELETE_EXPENSE_SUCCESS = ""
            + "The expense was deleted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_DELETE_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_DELETE_EXPENSE_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command Edit-Expense
    public static final String CONSOLE_COMMAND_EDIT_EXPENSE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE
            + " -"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_EXPENSE_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_EXPENSE_INDEX_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_NAME_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_AMOUNT_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_CATEGORY
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_CATEGORY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_REMARKS
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_REMARKS_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_CURRENCY
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_CURRENCY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_MODE_OF_PAYMENT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_EXPENSE_ARG_MODE_OF_PAYMENT_DESC
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_EDIT_EXPENSE_SUCCESS = ""
            + "The expense was edited successfully.";
    public static final String CONSOLE_ERROR_COMMAND_EDIT_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_EDIT_EXPENSE_SYNTAX;

    //endregion

    //@@author jeyvia
    //region Defines messages for console command Sort-Expense
    public static final String CONSOLE_COMMAND_SORT_EXPENSE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE
            + " -"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_TYPE
            + " "
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_TYPE_VAL_ALPHABETICAL
            + "/"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_TYPE_VAL_AMOUNT
            + "/"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_TYPE_VAL_DATE
            + "/"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_TYPE_VAL_CURRENCY
            + " -"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_ORDER
            + " "
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_ORDER_VAL_ASCENDING
            + "/"
            + ConsoleParserConfigurations.COMMAND_SORT_EXPENSE_ARG_ORDER_VAL_DESCENDING;
    public static final String CONSOLE_MESSAGE_COMMAND_SORTED_EXPENSE_SUCCESS = ""
            + "Your expenses have been sorted successfully.";
    public static final String COMMAND_SORT_EXPENSE_EMPTY_LIST = ""
            + "Your list of expenses is empty. ";
    public static final String CONSOLE_ERROR_COMMAND_SORT_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_SORT_EXPENSE_SYNTAX;

    //endregion

    //@@author jeyvia
    //region Defines messages for console command Convert-Currency
    public static final String CONSOLE_COMMAND_CONVERT_CURRENCY_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY
            + " -"
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_EXPENSE_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_EXPENSE_INDEX_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_CURRENCY
            + " "
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_CURRENCY_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_RATE
            + " "
            + ConsoleParserConfigurations.COMMAND_CONVERT_CURRENCY_ARG_RATE_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_CONVERT_CURRENCY_SUCCESS = ""
            + "The expense's currency was changed successfully.";
    public static final String CONSOLE_ERROR_COMMAND_CONVERT_CURRENCY_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_CONVERT_CURRENCY_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Add-Target
    public static final String CONSOLE_COMMAND_ADD_TARGET_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_NAME_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_AMOUNT_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_CURRENT_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_CURRENT_AMOUNT_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_TARGET_ARG_DESCRIPTION_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_TARGET_SUCCESS = ""
            + "The target was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_TARGET_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_ADD_TARGET_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command View-Target
    public static final String CONSOLE_COMMAND_VIEW_TARGET_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_VIEW_TARGET
            + " [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_TARGET_ARG_TARGET_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_TARGET_ARG_TARGET_INDEX_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_ERROR_COMMAND_VIEW_TARGET_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_VIEW_TARGET_SYNTAX;
    public static final String COMMAND_VIEW_TARGET_EMPTY_LIST = ""
            + "Your list of targets is empty. ";

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Delete-Target
    public static final String CONSOLE_COMMAND_DELETE_TARGET_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_DELETE_TARGET
            + " -"
            + ConsoleParserConfigurations.COMMAND_DELETE_TARGET_ARG_TARGET_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_DELETE_TARGET_ARG_TARGET_INDEX_LONG.toUpperCase();
    public static final String CONSOLE_MESSAGE_COMMAND_DELETE_TARGET_SUCCESS = ""
            + "The target was deleted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_DELETE_TARGET_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_DELETE_TARGET_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Edit-Target
    public static final String CONSOLE_COMMAND_EDIT_TARGET_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET
            + " -"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_TARGET_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_TARGET_INDEX_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_NAME_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_AMOUNT_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_CURRENT_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_TARGET_ARG_CURRENT_AMOUNT_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_EDIT_TARGET_SUCCESS = ""
            + "The target was edited successfully.";
    public static final String CONSOLE_ERROR_COMMAND_EDIT_TARGET_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_EDIT_TARGET_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Add-Income
    public static final String CONSOLE_COMMAND_ADD_INCOME_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_NAME_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_AMOUNT_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_INCOME_ARG_DESCRIPTION_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_INCOME_SUCCESS =
            "The income was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_INCOME_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_ADD_INCOME_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command View-Income
    public static final String CONSOLE_COMMAND_VIEW_INCOME_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_VIEW_INCOME
            + " [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_INCOME_ARG_INCOME_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_INCOME_ARG_INCOME_INDEX_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_ERROR_COMMAND_VIEW_INCOME_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_VIEW_INCOME_SYNTAX;
    public static final String COMMAND_VIEW_INCOME_EMPTY_LIST = ""
            + "Your list of incomes is empty. ";

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Delete-Income
    public static final String CONSOLE_COMMAND_DELETE_INCOME_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_DELETE_INCOME
            + " -"
            + ConsoleParserConfigurations.COMMAND_DELETE_INCOME_ARG_INCOME_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_DELETE_INCOME_ARG_INCOME_INDEX_LONG.toUpperCase();
    public static final String CONSOLE_MESSAGE_COMMAND_DELETE_INCOME_SUCCESS = ""
            + "The income was deleted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_DELETE_INCOME_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_DELETE_INCOME_SYNTAX;

    //endregion

    //@@author penguin-s
    //region Defines messages for console command Edit-Income
    public static final String CONSOLE_COMMAND_EDIT_INCOME_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME
            + " -"
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_INCOME_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_INCOME_INDEX_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_NAME_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_DATE_TIME
            + " "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_INCOME_ARG_AMOUNT_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_EDIT_INCOME_SUCCESS = ""
            + "The income was edited successfully.";
    public static final String CONSOLE_ERROR_COMMAND_EDIT_INCOME_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_EDIT_INCOME_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command Add-RecurringPayment
    public static final String CONSOLE_COMMAND_ADD_RECURRING_PAYMENT_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_NAME_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_INTERVAL
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_INTERVAL_LONG.toUpperCase()
            + " -"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_AMOUNT_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_CATEGORY
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_CATEGORY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_CURRENCY
            + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_CURRENCY_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_RECURRING_PAYMENT_SUCCESS = ""
            + "The recurring payment was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_ADD_RECURRING_PAYMENT_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command View-RecurringPayment
    public static final String CONSOLE_COMMAND_VIEW_RECURRING_PAYMENT_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_VIEW_RECURRING_PAYMENT
            + " [-"
            + ConsoleParserConfigurations.COMMAND_VIEW_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_ERROR_COMMAND_VIEW_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_VIEW_RECURRING_PAYMENT_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command Delete-RecurringPayment
    public static final String CONSOLE_COMMAND_DELETE_RECURRING_PAYMENT_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_DELETE_RECURRING_PAYMENT
            + " -"
            + ConsoleParserConfigurations.COMMAND_DELETE_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX
            + " "
            + ConsoleParserConfigurations
            .COMMAND_DELETE_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX_LONG
            .toUpperCase();
    public static final String CONSOLE_MESSAGE_COMMAND_DELETE_RECURRING_PAYMENT_SUCCESS = ""
            + "The recurring payment was deleted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_DELETE_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_DELETE_RECURRING_PAYMENT_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command Edit-RecurringPayment
    public static final String CONSOLE_COMMAND_EDIT_RECURRING_PAYMENT_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT
            + " -"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX_LONG.toUpperCase()
            + " [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_NAME
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_NAME_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_INTERVAL
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_INTERVAL_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_AMOUNT
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_AMOUNT_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_DESCRIPTION
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_DESCRIPTION_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_CATEGORY
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_CATEGORY_LONG.toUpperCase()
            + "] [-"
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_CURRENCY
            + " "
            + ConsoleParserConfigurations.COMMAND_EDIT_RECURRING_PAYMENT_ARG_CURRENCY_LONG.toUpperCase()
            + "]";
    public static final String CONSOLE_MESSAGE_COMMAND_EDIT_RECURRING_PAYMENT_SUCCESS = ""
            + "The recurring payment was edited successfully.";
    public static final String CONSOLE_ERROR_COMMAND_EDIT_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_EDIT_RECURRING_PAYMENT_SYNTAX;

    //endregion

    //@@author xzynos
    //region Defines messages for console command Pay-RecurringPayment
    public static final String CONSOLE_COMMAND_PAY_RECURRING_PAYMENT_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_PAY_RECURRING_PAYMENT
            + " -"
            + ConsoleParserConfigurations.COMMAND_PAY_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX
            + " "
            + ConsoleParserConfigurations
            .COMMAND_PAY_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX_LONG
            .toUpperCase();
    public static final String CONSOLE_MESSAGE_COMMAND_PAY_RECURRING_PAYMENT_SUCCESS = ""
            + "The recurring payment was added as an expense successfully.";
    public static final String CONSOLE_ERROR_COMMAND_PAY_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_PAY_RECURRING_PAYMENT_SYNTAX;

    //endregion

    //@@author LokQiJun
    //region Defines messages for console command Merge-File
    public static final String CONSOLE_COMMAND_MERGE_FILE_SYNTAX = ""
            + "SYNTAX: "
            + ConsoleParserConfigurations.COMMAND_MERGE_FILE
            + " -"
            + ConsoleParserConfigurations.COMMAND_MERGE_FILE_ARG_MERGE_FILE_PATH
            + " "
            + ConsoleParserConfigurations.COMMAND_MERGE_FILE_ARG_MERGE_FILE_PATH_LONG.toUpperCase()
            + "";
    public static final String CONSOLE_ERROR_COMMAND_MERGE_FILE_INVALID = ""
            + "The arguments entered are invalid. "
            + CONSOLE_COMMAND_MERGE_FILE_SYNTAX;

    //endregion
}
