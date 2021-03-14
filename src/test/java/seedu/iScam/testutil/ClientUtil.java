package seedu.iScam.testutil;

import static seedu.iScam.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.iScam.logic.parser.CliSyntax.PREFIX_LOCATION;
import static seedu.iScam.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.iScam.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.iScam.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.Set;

import seedu.iScam.logic.commands.AddCommand;
import seedu.iScam.logic.commands.EditCommand.EditClientDescriptor;
import seedu.iScam.model.client.Client;
import seedu.iScam.model.tag.Tag;

/**
 * A utility class for Client.
 */
public class ClientUtil {

    /**
     * Returns an add command string for adding the {@code client}.
     */
    public static String getAddCommand(Client client) {
        return AddCommand.COMMAND_WORD + " " + getClientDetails(client);
    }

    /**
     * Returns the part of command string for the given {@code client}'s details.
     */
    public static String getClientDetails(Client client) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + client.getName().fullName + " ");
        sb.append(PREFIX_PHONE + client.getPhone().value + " ");
        sb.append(PREFIX_EMAIL + client.getEmail().value + " ");
        sb.append(PREFIX_LOCATION + client.getLocation().value + " ");
        client.getTags().stream().forEach(
            s -> sb.append(PREFIX_TAG + s.tagName + " ")
        );
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditClientDescriptor}'s details.
     */
    public static String getEditClientDescriptorDetails(EditClientDescriptor descriptor) {
        StringBuilder sb = new StringBuilder();
        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
        descriptor.getLocation().ifPresent(location -> sb.append(PREFIX_LOCATION).append(location.value).append(" "));
        if (descriptor.getTags().isPresent()) {
            Set<Tag> tags = descriptor.getTags().get();
            if (tags.isEmpty()) {
                sb.append(PREFIX_TAG);
            } else {
                tags.forEach(s -> sb.append(PREFIX_TAG).append(s.tagName).append(" "));
            }
        }
        return sb.toString();
    }
}
