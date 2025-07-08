package org.fuxi.runecraft.Items.ItemType;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TranslatableComponent;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.CustomModelDataComponent;

public class CustomItem extends ItemStack {
    String translationKey;
    Material material;
    CustomModelDataComponent modelDataComponent;


    public CustomItem() {
        this.setType(material);
        ItemMeta meta = this.getItemMeta();
        meta.setCustomModelDataComponent(modelDataComponent);
        meta.displayName(Component.translatable(translationKey));
    }
}
