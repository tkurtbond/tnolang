// Generated from TNOO.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TNOOParser}.
 */
public interface TNOOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TNOOParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TNOOParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TNOOParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(TNOOParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(TNOOParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(TNOOParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(TNOOParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#declSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSeq(TNOOParser.DeclSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#declSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSeq(TNOOParser.DeclSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(TNOOParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(TNOOParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(TNOOParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(TNOOParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(TNOOParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(TNOOParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#procDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcDecl(TNOOParser.ProcDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#procDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcDecl(TNOOParser.ProcDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#forwardDecl}.
	 * @param ctx the parse tree
	 */
	void enterForwardDecl(TNOOParser.ForwardDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#forwardDecl}.
	 * @param ctx the parse tree
	 */
	void exitForwardDecl(TNOOParser.ForwardDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#formalPars}.
	 * @param ctx the parse tree
	 */
	void enterFormalPars(TNOOParser.FormalParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#formalPars}.
	 * @param ctx the parse tree
	 */
	void exitFormalPars(TNOOParser.FormalParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#fPSection}.
	 * @param ctx the parse tree
	 */
	void enterFPSection(TNOOParser.FPSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#fPSection}.
	 * @param ctx the parse tree
	 */
	void exitFPSection(TNOOParser.FPSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(TNOOParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(TNOOParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TNOOParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TNOOParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(TNOOParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(TNOOParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(TNOOParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(TNOOParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TNOOParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TNOOParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(TNOOParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(TNOOParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#caseLabels}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabels(TNOOParser.CaseLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#caseLabels}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabels(TNOOParser.CaseLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(TNOOParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(TNOOParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(TNOOParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#constExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(TNOOParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TNOOParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TNOOParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TNOOParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TNOOParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(TNOOParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(TNOOParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TNOOParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TNOOParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TNOOParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TNOOParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(TNOOParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(TNOOParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(TNOOParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(TNOOParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(TNOOParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(TNOOParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(TNOOParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(TNOOParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(TNOOParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(TNOOParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(TNOOParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(TNOOParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(TNOOParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(TNOOParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#identList}.
	 * @param ctx the parse tree
	 */
	void enterIdentList(TNOOParser.IdentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#identList}.
	 * @param ctx the parse tree
	 */
	void exitIdentList(TNOOParser.IdentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#qualident}.
	 * @param ctx the parse tree
	 */
	void enterQualident(TNOOParser.QualidentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#qualident}.
	 * @param ctx the parse tree
	 */
	void exitQualident(TNOOParser.QualidentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TNOOParser#identDef}.
	 * @param ctx the parse tree
	 */
	void enterIdentDef(TNOOParser.IdentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TNOOParser#identDef}.
	 * @param ctx the parse tree
	 */
	void exitIdentDef(TNOOParser.IdentDefContext ctx);
}