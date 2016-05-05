package com.sample.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Category implements ApiRcEntity {
    String name;
    String description;
    String type;
    int businessOutcomeID;
    
    
    public String getName() {
		return name;
	}
    
    public String getDescription() {
		return description;
	}

    public String getType() {
		return type;
	}

    public void setName(String name) {
		this.name = name;
	}
    
    public void setDescription(String description) {
		this.description = description;
	}

    public void setType(String type) {
		this.type = type;
	}

	public int getBusinessOutcomeID() {
		return businessOutcomeID;
	}

	public void setBusinessOutcomeID(int businessOutcomeID) {
		this.businessOutcomeID = businessOutcomeID;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description
				+ ", type=" + type + ", BusinessOutcomeID=" + businessOutcomeID
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


}
