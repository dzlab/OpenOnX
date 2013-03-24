grammar DoToT;

@members {
    Interpreter interp;
    public DoToTParser(TokenStream input, Interpreter interp) {
        this(input);
        this.interp = interp;
    }
}

rule : 'this' ('is'|'was') IDENTIFIER WORD |
	option service argument ON event
	  ;

option  :   	WORD?;

service returns [Service ref]
	:	WORD {$ref = interp.getServicebyName($WORD.text);}
	; 

destination
	:	ME | TO? IDENTIFIER (WORD)?;

event	:	condition | action;

condition
	:	IDENTIFIER attribute;

action	:	subject verb object | subject isin state;

subject	:	'i' | WORD;

verb	:	WORD;

object	returns [Context ref]
	:	WORD {$ref = interp.getContextbyName($WORD.text);}
	;

isin	:	'is' | 'are' ;

state	returns [Context ref]
	:	WORD {$ref = interp.getContextbyName($WORD.text);}
	;

attribute
	:	WORD;

argument:	destination text | text destination?;

text	:	( WORD text )?;

IDENTIFIER
	:	'my'|'his'|'her'|'our'|'their';	 

ON	:	'on'|'while'|'if'|'when'|'at';

TO	:	'to';

ME	:	'me';

WORD
    :   ('a'..'z'|'A'..'Z')+;   

WS : (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;};
    