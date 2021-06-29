package by.htp.secondpr.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.secondpr.controller.impl.AutorizationCommand;
import by.htp.secondpr.controller.impl.RegistrationCommand;
import by.htp.secondpr.controller.impl.RegistrationNewUserCommand;
import by.htp.secondpr.controller.impl.UnknownCommand;
import by.htp.secondpr.controller.impl.ValidationUserCommand;

public class CommandProvider {
	private Map<CommandsName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandsName.AUTORIZATION, new AutorizationCommand());
		commands.put(CommandsName.REGISTRATION, new RegistrationCommand());
		commands.put(CommandsName.REGISTRATION_NEW_USER, new RegistrationNewUserCommand());
		commands.put(CommandsName.VALIDATION_USER, new ValidationUserCommand());
		commands.put(CommandsName.UNKNOWN_COMMAND, new UnknownCommand());
	}

	public Command findCommand(String name) {
		if (name == null) {
			name = CommandsName.UNKNOWN_COMMAND.toString();
		}
		CommandsName commandsname;

		try {
			commandsname = CommandsName.valueOf(name.toUpperCase());
		} catch (IllegalArgumentException e) {
			commandsname = CommandsName.UNKNOWN_COMMAND;
		}
		return commands.get(commandsname);
	}
}
