package jala.data;

public enum ItemType {
	HABITATS("Habitat"),
	BUNKERS("bunkers"),
	FOOD("food"),
	ROVERS("rovers");
	
	private String name;

	private ItemType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static ItemType getItemType(String type) throws Exception {
		System.out.println("type " + type);
		for (ItemType itemType : values()) {
			if (itemType.getName().equalsIgnoreCase(type))
				return itemType;
		}
		throw new Exception("invalid ItemType: " + type);
	}
}
