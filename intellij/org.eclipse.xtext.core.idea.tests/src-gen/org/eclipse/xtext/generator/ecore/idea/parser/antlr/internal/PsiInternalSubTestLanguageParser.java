package org.eclipse.xtext.generator.ecore.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.generator.ecore.idea.lang.SubTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.generator.ecore.services.SubTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalSubTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'ups'", "'super'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public PsiInternalSubTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalSubTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalSubTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g"; }



    	protected SubTestLanguageGrammarAccess grammarAccess;

    	protected SubTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalSubTestLanguageParser(PsiBuilder builder, TokenStream input, SubTestLanguageElementTypeProvider elementTypeProvider, SubTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "SubMain";
    	}




    // $ANTLR start "entryRuleSubMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:52:1: entryRuleSubMain : ruleSubMain EOF ;
    public final void entryRuleSubMain() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:52:17: ( ruleSubMain EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:53:2: ruleSubMain EOF
            {
             markComposite(elementTypeProvider.getSubMainElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubMain_in_entryRuleSubMain54);
            ruleSubMain();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubMain60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubMain"


    // $ANTLR start "ruleSubMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:59:1: ruleSubMain : (otherlv_0= '{' ( (lv_superMains_1_0= ruleSuperMain ) ) otherlv_2= '}' ( (lv_another_3_0= ruleAnotherSuperMain ) )? ) ;
    public final void ruleSubMain() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:59:12: ( (otherlv_0= '{' ( (lv_superMains_1_0= ruleSuperMain ) ) otherlv_2= '}' ( (lv_another_3_0= ruleAnotherSuperMain ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:60:2: (otherlv_0= '{' ( (lv_superMains_1_0= ruleSuperMain ) ) otherlv_2= '}' ( (lv_another_3_0= ruleAnotherSuperMain ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:60:2: (otherlv_0= '{' ( (lv_superMains_1_0= ruleSuperMain ) ) otherlv_2= '}' ( (lv_another_3_0= ruleAnotherSuperMain ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:61:3: otherlv_0= '{' ( (lv_superMains_1_0= ruleSuperMain ) ) otherlv_2= '}' ( (lv_another_3_0= ruleAnotherSuperMain ) )?
            {

            			markLeaf();
            		
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSubMain79); 

            			doneLeaf(otherlv_0, elementTypeProvider.getSubMain_LeftCurlyBracketKeyword_0ElementType());
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:68:3: ( (lv_superMains_1_0= ruleSuperMain ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:69:4: (lv_superMains_1_0= ruleSuperMain )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:69:4: (lv_superMains_1_0= ruleSuperMain )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:70:5: lv_superMains_1_0= ruleSuperMain
            {

            					markComposite(elementTypeProvider.getSubMain_SuperMainsSuperMainParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_ruleSuperMain_in_ruleSubMain106);
            ruleSuperMain();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            			markLeaf();
            		
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSubMain131); 

            			doneLeaf(otherlv_2, elementTypeProvider.getSubMain_RightCurlyBracketKeyword_2ElementType());
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:86:3: ( (lv_another_3_0= ruleAnotherSuperMain ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:87:4: (lv_another_3_0= ruleAnotherSuperMain )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:87:4: (lv_another_3_0= ruleAnotherSuperMain )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:88:5: lv_another_3_0= ruleAnotherSuperMain
                    {

                    					markComposite(elementTypeProvider.getSubMain_AnotherAnotherSuperMainParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_ruleAnotherSuperMain_in_ruleSubMain158);
                    ruleAnotherSuperMain();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSubMain"


    // $ANTLR start "entryRuleAnotherSuperMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:101:1: entryRuleAnotherSuperMain : ruleAnotherSuperMain EOF ;
    public final void entryRuleAnotherSuperMain() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:101:26: ( ruleAnotherSuperMain EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:102:2: ruleAnotherSuperMain EOF
            {
             markComposite(elementTypeProvider.getAnotherSuperMainElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnotherSuperMain_in_entryRuleAnotherSuperMain190);
            ruleAnotherSuperMain();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnotherSuperMain196); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnotherSuperMain"


    // $ANTLR start "ruleAnotherSuperMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:108:1: ruleAnotherSuperMain : (otherlv_0= 'ups' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleAnotherSuperMain() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:108:21: ( (otherlv_0= 'ups' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:109:2: (otherlv_0= 'ups' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:109:2: (otherlv_0= 'ups' ( (lv_name_1_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:110:3: otherlv_0= 'ups' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf();
            		
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnotherSuperMain215); 

            			doneLeaf(otherlv_0, elementTypeProvider.getAnotherSuperMain_UpsKeyword_0ElementType());
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:117:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:118:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:118:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:119:5: lv_name_1_0= RULE_ID
            {

            					markLeaf();
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnotherSuperMain242); 

            					doneLeaf(lv_name_1_0, elementTypeProvider.getAnotherSuperMain_NameIDTerminalRuleCall_1_0ElementType());
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAnotherSuperMain"


    // $ANTLR start "entryRuleSuperMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:132:1: entryRuleSuperMain : ruleSuperMain EOF ;
    public final void entryRuleSuperMain() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:132:19: ( ruleSuperMain EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:133:2: ruleSuperMain EOF
            {
             markComposite(elementTypeProvider.getSuperMainElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleSuperMain_in_entryRuleSuperMain273);
            ruleSuperMain();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSuperMain279); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperMain"


    // $ANTLR start "ruleSuperMain"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:139:1: ruleSuperMain : (otherlv_0= 'super' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final void ruleSuperMain() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:139:14: ( (otherlv_0= 'super' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:140:2: (otherlv_0= 'super' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:140:2: (otherlv_0= 'super' ( (lv_name_1_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:141:3: otherlv_0= 'super' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf();
            		
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSuperMain298); 

            			doneLeaf(otherlv_0, elementTypeProvider.getSuperMain_SuperKeyword_0ElementType());
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:149:4: (lv_name_1_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/generator/ecore/idea/parser/antlr/internal/PsiInternalSubTestLanguage.g:150:5: lv_name_1_0= RULE_ID
            {

            					markLeaf();
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSuperMain325); 

            					doneLeaf(lv_name_1_0, elementTypeProvider.getSuperMain_NameIDTerminalRuleCall_1_0ElementType());
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSuperMain"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSubMain_in_entryRuleSubMain54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubMain60 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSubMain79 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSuperMain_in_ruleSubMain106 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubMain131 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleAnotherSuperMain_in_ruleSubMain158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnotherSuperMain_in_entryRuleAnotherSuperMain190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnotherSuperMain196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleAnotherSuperMain215 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnotherSuperMain242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuperMain_in_entryRuleSuperMain273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSuperMain279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleSuperMain298 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSuperMain325 = new BitSet(new long[]{0x0000000000000002L});
    }


}