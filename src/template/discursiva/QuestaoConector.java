package template.discursiva;



import template.discursiva.R;
import android.app.Activity;


public class QuestaoConector extends Activity{
	//variável para tratar a quantidade de questões
	//Ao total quantas questões há neste programa?
	protected final int h = 47;
	
	//variáveis para tratar os R.string, isto é, as strings do programa
	protected int[] a = new int[h];
	protected int[][] b = new int[h][6];
	
	public int get_EnderecoDaQuestao(int valor){
		valor = this.a[valor];
		return valor;
	}
	
	public int get_QtdeDeQuestoes(){
		return this.h;
	}
	
	//construtor
	public QuestaoConector(){
		//ligando as questões (strings.xml) aos arrays, pois assim poderemos randomizar as questões
		//ligando as alternativas (strings.xml) aos arrays bidimensional, assim poderemos manter as alternativas às respectivas questões equivalentes, o primeiro [] é referente a questão e o segundo [] à posição da alternativa.
		a[0]=R.string.q0;
		b[0][0]=R.string.q0a;
		a[1]=R.string.q1;
		b[1][0]=R.string.q1a;
		a[2]=R.string.q2;
		b[2][0]=R.string.q2a;
		a[3]=R.string.q3;
		b[3][0]=R.string.q3a;
		a[4]=R.string.q4;
		b[4][0]=R.string.q4a;
		a[5]=R.string.q5;
		b[5][0]=R.string.q5a;
		a[6]=R.string.q6;
		b[6][0]=R.string.q6a;
		a[7]=R.string.q7;
		b[7][0]=R.string.q7a;
		a[8]=R.string.q8;
		b[8][0]=R.string.q8a;
		a[9]=R.string.q9;
		b[9][0]=R.string.q9a;
		a[10]=R.string.q10;
		b[10][0]=R.string.q10a;
		a[11]=R.string.q11;
		b[11][0]=R.string.q11a;
		a[12]=R.string.q12;
		b[12][0]=R.string.q12a;
		a[13]=R.string.q13;
		b[13][0]=R.string.q13a;
		a[14]=R.string.q14;
		b[14][0]=R.string.q14a;
		a[15]=R.string.q15;
		b[15][0]=R.string.q15a;
		a[16]=R.string.q16;
		b[16][0]=R.string.q16a;
		a[17]=R.string.q17;
		b[17][0]=R.string.q17a;
		a[18]=R.string.q18;
		b[18][0]=R.string.q18a;
		a[19]=R.string.q19;
		b[19][0]=R.string.q19a;
		a[20]=R.string.q20;
		b[20][0]=R.string.q20a;
		a[21]=R.string.q21;
		b[21][0]=R.string.q21a;
		a[22]=R.string.q22;
		b[22][0]=R.string.q22a;
		a[23]=R.string.q23;
		b[23][0]=R.string.q23a;
		a[24]=R.string.q24;
		b[24][0]=R.string.q24a;
		a[25]=R.string.q25;
		b[25][0]=R.string.q25a;
		a[26]=R.string.q26;
		b[26][0]=R.string.q26a;
		a[27]=R.string.q27;
		b[27][0]=R.string.q27a;
		a[28]=R.string.q28;
		b[28][0]=R.string.q28a;
		a[29]=R.string.q29;
		b[29][0]=R.string.q29a;
		a[30]=R.string.q30;
		b[30][0]=R.string.q30a;
		a[31]=R.string.q31;
		b[31][0]=R.string.q31a;
		a[32]=R.string.q32;
		b[32][0]=R.string.q32a;
		a[33]=R.string.q33;
		b[33][0]=R.string.q33a;
		a[34]=R.string.q34;
		b[34][0]=R.string.q34a;
		a[35]=R.string.q35;
		b[35][0]=R.string.q35a;
		a[36]=R.string.q36;
		b[36][0]=R.string.q36a;
		a[37]=R.string.q37;
		b[37][0]=R.string.q37a;
		a[38]=R.string.q38;
		b[38][0]=R.string.q38a;
		a[39]=R.string.q39;
		b[39][0]=R.string.q39a;
		a[40]=R.string.q40;
		b[40][0]=R.string.q40a;
		a[41]=R.string.q41;
		b[41][0]=R.string.q41a;
		a[42]=R.string.q42;
		b[42][0]=R.string.q42a;
		a[43]=R.string.q43;
		b[43][0]=R.string.q43a;
		a[44]=R.string.q44;
		b[44][0]=R.string.q44a;
		a[45]=R.string.q45;
		b[45][0]=R.string.q45a;
		a[46]=R.string.q46;
		b[46][0]=R.string.q46a;


	}
}
