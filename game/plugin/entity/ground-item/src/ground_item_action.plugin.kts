import org.apollo.game.message.impl.InventoryItemMessage
import org.apollo.game.message.impl.TakeTileItemMessage
import org.apollo.game.model.Item

on { InventoryItemMessage::class }
    .where { option == 5 }
    .then {
        // This is just a stub, for now.
        // Several other things need to be done here:
        // - Items may only be dropped from your inventory
        // - Items dropped must be removed from your inventory
        // - Items must be checked to ensure they have a 'drop' option
        //3val item = it.inventory.get(slot)
        //val all = it.inventory.get(slot).amount
        //if (it.inventory.removeSlot(slot, all) == all)
        //it.addGroundItem(item, it.position)
    }