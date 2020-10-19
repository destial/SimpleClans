package net.sacredlabyrinth.phaed.simpleclans.commands.conditions;

import co.aikar.commands.BukkitCommandExecutionContext;
import co.aikar.commands.BukkitCommandIssuer;
import co.aikar.commands.ConditionContext;
import co.aikar.commands.InvalidCommandArgument;
import net.sacredlabyrinth.phaed.simpleclans.ClanPlayer;
import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class ClanMemberCondition extends AbstractParameterCondition<ClanPlayer> {
    public ClanMemberCondition(@NotNull SimpleClans plugin) {
        super(plugin);
    }

    @Override
    public Class<ClanPlayer> getType() {
        return ClanPlayer.class;
    }

    @Override
    public void validateCondition(ConditionContext<BukkitCommandIssuer> context,
                                  BukkitCommandExecutionContext execContext, ClanPlayer value)
            throws InvalidCommandArgument {
        Conditions.assertClanMember(clanManager, context.getIssuer());
    }

    @Override
    public @NotNull String getId() {
        return "clan_member";
    }
}
