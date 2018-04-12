package com.core.hackthon.visa;


 class BalancedParenthisisCheck {
	
	public static class BracketStack {
		

		private Object[] data;
		private int index = 0;
		private int size = 0;
		
		public BracketStack() {
			super();
			this.size = 50; 
			data = new Object[this.size];
		}
		/**
		 * @param o
		 * @throws RuntimeException
		 */
		public void push(char o) {
			if (index >= size) {
				this.increaseSize();
			}
			this.data[index] = o;
			index++;
		}
		/**
		 * @return
		 */
		public Object pop() {
			if (index != 0) {
				Object obj = data[index - 1];
				this.data[index - 1] = null; 
				index--;
				return obj;
			} else
				return null;
		}
		public Object peek() throws RuntimeException {
			if (index != 0)
				return this.data[index - 1];
			else
				return null;
		}
		
		public boolean isEmpty() {
			return index == 0 ? true : false;
		}
		public int getStackSize() {
			return index;
		}
		public void deleteStack() {
			if (index != 0) {
				for (int i = 0; i < index; i++) {
					this.data[i] = null;
				}
				index = 0;
				System.out.println("The Stack has been deleted");
			}
		}
		private void increaseSize() {
			Object[] temp = new Object[size];
			size = size * 2;
			for (int i = 0; i < index; i++) {
				temp[i] = this.data[i];
			}
			this.data = new Object[this.size];
			for (int i = 0; i < index; i++) {
				this.data[i] = temp[i];
			}
		}


	}
	
	
	public static String  isBalance(String str) {
		BracketStack stack = new BracketStack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if ((ch == ']' || ch == '}' || ch == ')')
					&& (!stack.isEmpty())) {
				if (((char) stack.peek() == '(' && ch == ')')
						|| ((char) stack.peek() == '{' && ch == '}')
						|| ((char) stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return "false";
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "false";
				}
			}
		}
		if (stack.isEmpty())
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		String str = "([{)";
		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		System.out.println(BalancedParenthisisCheck.isBalance(str));
	}
}
