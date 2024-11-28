package ziochri.primamoddellozio;

 public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(FabricDocsReference.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
     public static final Item SPADAPENE = register(
             new Item(new Item.Settings()),
             "spadapene"
     );
}
