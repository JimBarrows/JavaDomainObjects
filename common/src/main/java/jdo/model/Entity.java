package jdo.model;

import java.io.Serializable;
import java.util.UUID;

public interface Entity extends Serializable {

	UUID getId();
}
