package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_124_Interfaces_Challenge;

import java.util.List;

public interface ISaveable {
	List<String> write();
	void read(List<String> savedValues);
}
