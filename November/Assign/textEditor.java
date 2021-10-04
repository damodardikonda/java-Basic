class TextEditor{

    String textEditorName;
    String creator;

	TextEditor(String textEditorName, String creator){

		this.textEditorName = textEditorName;
		this.creator = creator;
	}

	class PunchingCard{

       
       void cardInfo(){

       	  System.out.println("Text Editor Name = " + TextEditor.this.textEditorName);
       	  System.out.println("Creator is = " + TextEditor.this.creator);
       }
	}


	public static void main(String[] args) {
		
		TextEditor atom =  new TextEditor("Atom" , "GitHub");
		PunchingCard  p1 = atom.new PunchingCard();
		p1.cardInfo();

		TextEditor vim =  new TextEditor("VIM" , "Bram Moolenaar");
		PunchingCard  p2 = vim.new PunchingCard();
		p2.cardInfo();

		TextEditor sublime =  new TextEditor("Sublime" , "Sublime HQ");
		PunchingCard  p3 = sublime.new PunchingCard();
		p3.cardInfo();


	}

}