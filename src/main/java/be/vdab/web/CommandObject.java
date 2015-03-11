package be.vdab.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandObject {
	private String[] array = new String[1];
	private List<String> list = Arrays.asList("");
	private Map<Integer, String> map = new HashMap<>();

	public String[] getArray() {
		return array;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

}
