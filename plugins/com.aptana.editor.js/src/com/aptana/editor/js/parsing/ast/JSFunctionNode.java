package com.aptana.editor.js.parsing.ast;

import com.aptana.parsing.ast.IParseNode;

public class JSFunctionNode extends JSNode
{

	private String fName;

	public JSFunctionNode(JSNode[] children, int start, int end)
	{
		this("", children, start, end); //$NON-NLS-1$
	}

	public JSFunctionNode(String functionName, JSNode[] children, int start, int end)
	{
		super(JSNodeTypes.FUNCTION, children, start, end);
		fName = functionName;
	}

	public String getName()
	{
		return fName;
	}

	@Override
	public String toString()
	{
		StringBuilder text = new StringBuilder();
		text.append("function "); //$NON-NLS-1$
		if (fName.length() > 0)
		{
			text.append(fName).append(" "); //$NON-NLS-1$
		}
		IParseNode[] children = getChildren();
		text.append(children[0]).append(" ").append(children[1]); //$NON-NLS-1$
		return appendSemicolon(text.toString());
	}
}
