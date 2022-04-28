package com.edu;



public class TextEditor {
private SpellCheck Spellcheck;

public SpellCheck getSpellcheck() {
	return Spellcheck;
}

public void setSpellcheck(SpellCheck spellCheck) {
	this.Spellcheck = spellCheck;
}

public void TextEditorFunction() {
	if(Spellcheck!=null) {
		Spellcheck.enable();
	}
		
	
	else {
		System.out.println("Spellcheck is disabled");
	}
	
}
}
		

		


		
