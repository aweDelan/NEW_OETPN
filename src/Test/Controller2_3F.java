package Test;
import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller2_3F{

	public static void main (String []args) {
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Controller";
		pn.SetName("Controller");
		pn.NetworkPort = 1083;
		
		DataString ini = new DataString();
		//ini.Printable = false;
		ini.SetName("ini");
		ini.SetValue("red");
		pn.PlaceList.add(ini);
		
		DataString red = new DataString();
		//red.Printable = false;
		red.SetName("red");
		red.SetValue("red");
		pn.PlaceList.add(red);
		
		DataString green = new DataString();
		//green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.PlaceList.add(green);
		
		DataString yellow = new DataString();
		//yellow.Printable = false;
		yellow.SetName("yellow");
		yellow.SetValue("yellow");
		pn.PlaceList.add(yellow);
		
		DataString p1 = new DataString();
		p1.SetName("r1r2r3");
		p1.SetValue("signal");
		pn.PlaceList.add(p1);
		
		DataString p2 = new DataString();
		p2.SetName("g1r2r3");
		pn.PlaceList.add(p2);
		
		DataString p3 = new DataString();
		p3.SetName("y1r2r3");
		pn.PlaceList.add(p3);
		
		DataString p4 = new DataString();
		p4.SetName("r1g2r3");
		pn.PlaceList.add(p4);
		
		DataString p5 = new DataString();
		p5.SetName("r1y2r3");
		pn.PlaceList.add(p5);
		
		DataString p6 = new DataString();
		p6.SetName("r1r2g3");
		pn.PlaceList.add(p6);
		
		DataString p7 = new DataString();
		p7.SetName("r1r2y3");
		pn.PlaceList.add(p7);
		
		
		DataTransfer p10 = new DataTransfer();
		p10.SetName("OP1");
		p10.Value = new TransferOperation("localhost", "1080" , "P_TL10");
		pn.PlaceList.add(p10);
		
		DataTransfer p11 = new DataTransfer();
		p11.SetName("OP2");
		p11.Value = new TransferOperation("localhost", "1080" , "P_TL7");
		pn.PlaceList.add(p11);
		
		DataTransfer p12 = new DataTransfer();
		p12.SetName("OP3");
		p12.Value = new TransferOperation("localhost", "1080" , "P_TL8");
		pn.PlaceList.add(p12);
		
	
		
		
		//----------------------------iniT------------------------------------
		PetriTransition iniT = new PetriTransition(pn);
		iniT.TransitionName = "iniT";
		iniT.InputPlaceName.add("ini");
		
		Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

		GuardMapping grdiniT = new GuardMapping();
		grdiniT.condition= iniTCt1;
		
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
		grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP3"));
	
		
		iniT.GuardMappingList.add(grdiniT);
	
		iniT.Delay = 5;
		pn.Transitions.add(iniT);
		
		
		
		//----------------------------T1------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T1";
		t1.InputPlaceName.add("r1r2r3");
		t1.InputPlaceName.add("green");
		
		
		Condition T1Ct1 = new Condition(t1, "r1r2r3", TransitionCondition.NotNull);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "r1r2r3", TransitionOperation.Move, "g1r2r3"));
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "OP1"));
		
		grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.Move, "green"));
		t1.GuardMappingList.add(grdT1);
	
		t1.Delay = 5;
		pn.Transitions.add(t1);
		
		//----------------------------T2------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T2";
		t2.InputPlaceName.add("g1r2r3");
		t2.InputPlaceName.add("yellow");
		
		
		Condition T2Ct1 = new Condition(t2, "g1r2r3", TransitionCondition.NotNull);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition= T2Ct1;
		grdT2.Activations.add(new Activation(t2, "g1r2r3", TransitionOperation.Move, "y1r2r3"));
		grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));
		//grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP3"));
		
		grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.Move, "yellow"));
		
		t2.GuardMappingList.add(grdT2);
	
		t2.Delay = 5;
		pn.Transitions.add(t2);
		
		
		//----------------------------T3------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T3";
		t3.InputPlaceName.add("y1r2r3");
		t3.InputPlaceName.add("green");
		t3.InputPlaceName.add("red");
		
		
		
		Condition T3Ct1 = new Condition(t2, "y1r2r3", TransitionCondition.NotNull);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition= T3Ct1;
		grdT3.Activations.add(new Activation(t3, "y1r2r3", TransitionOperation.Move, "r1g2r3"));
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "OP1"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP2"));
		
		grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.Move, "red"));
		grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.Move, "green"));
				
		t3.GuardMappingList.add(grdT3);
	
		t3.Delay = 5;
		pn.Transitions.add(t3);
		
		
		//----------------------------T4------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T4";
		t4.InputPlaceName.add("r1g2r3");
		t4.InputPlaceName.add("yellow");
		
		
		Condition T4Ct1 = new Condition(t4, "r1g2r3", TransitionCondition.NotNull);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition= T4Ct1;
		grdT4.Activations.add(new Activation(t4, "r1g2r3", TransitionOperation.Move, "r1y2r3"));
		grdT4.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));
		
		grdT4.Activations.add(new Activation(t4, "yellow", TransitionOperation.Move, "yellow"));
		
		t4.GuardMappingList.add(grdT4);
	
		t4.Delay = 5;
		pn.Transitions.add(t4);
		
		
		//----------------------------T5------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T5";
		t5.InputPlaceName.add("r1y2r3");
		t5.InputPlaceName.add("red");	
		t5.InputPlaceName.add("green");

		
		
		Condition T5Ct1 = new Condition(t5, "r1y2r3", TransitionCondition.NotNull);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition= T5Ct1;
		grdT5.Activations.add(new Activation(t5, "r1y2r3", TransitionOperation.Move, "r1r2g3"));
		grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "OP2"));
		grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.SendOverNetwork,"OP3"));
		
		grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.Move, "red"));
		grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.Move, "green"));
		
		t5.GuardMappingList.add(grdT5);
	
		t5.Delay = 5;
		pn.Transitions.add(t5);
		
		//----------------------------T6------------------------------------
				PetriTransition t6 = new PetriTransition(pn);
				t6.TransitionName = "T6";
				t6.InputPlaceName.add("r1r2g3");
				t6.InputPlaceName.add("yellow");
				
				
				Condition T6Ct1 = new Condition(t6, "r1r2g3", TransitionCondition.NotNull);

				GuardMapping grdT6 = new GuardMapping();
				grdT6.condition= T6Ct1;
				grdT6.Activations.add(new Activation(t6, "r1r2g3", TransitionOperation.Move, "r1r2y3"));
				grdT6.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));
				
				grdT6.Activations.add(new Activation(t6, "yellow", TransitionOperation.Move, "yellow"));
				
				t6.GuardMappingList.add(grdT6);
			
				t6.Delay = 5;
				pn.Transitions.add(t6);
				//----------------------------T7------------------------------------
				PetriTransition t7 = new PetriTransition(pn);
				t7.TransitionName = "T7";
				t7.InputPlaceName.add("r1r2y3");
				t7.InputPlaceName.add("red");	
				
				Condition T7Ct1 = new Condition(t7, "r1r2y3", TransitionCondition.NotNull);

				GuardMapping grdT7 = new GuardMapping();
				grdT7.condition= T7Ct1;
				grdT7.Activations.add(new Activation(t7, "r1r2y3", TransitionOperation.Move, "r1r2r3"));
				
				grdT7.Activations.add(new Activation(t7, "red", TransitionOperation.SendOverNetwork, "OP3"));
				
				grdT7.Activations.add(new Activation(t7, "red", TransitionOperation.Move, "red"));	
				t7.GuardMappingList.add(grdT7);
			
				t7.Delay = 5;
				pn.Transitions.add(t7);
			
		// -------------------------------------------------------------------------------------
		// ----------------------------PN Start-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Exp1 started \n ------------------------------");
		pn.Delay = 2000;
		// pn.Start();

		PetriNetWindow frame = new PetriNetWindow();
		frame.petriNet = pn;
		frame.setVisible(true);
		
		
			
		
		
	}
}
