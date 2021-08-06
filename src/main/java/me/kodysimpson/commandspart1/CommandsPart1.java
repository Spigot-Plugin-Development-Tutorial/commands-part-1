package me.kodysimpson.commandspart1;

import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsPart1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //checking to see what command was run
        if (label.equalsIgnoreCase("die")){

            System.out.println("I have been run by someone.");

            //Check to see if a Player ran the command or something else
            if (sender instanceof Player){

                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You have opted to die.");

            }else if (sender instanceof ConsoleCommandSender){

                System.out.println("The command was ran in the console.");

            }else if(sender instanceof BlockCommandSender){

                System.out.println("The command was ran by a command block.");

            }

        }

        //return true if the command was used correctly, but i generally just return true no matter what
        return true;
    }
}
