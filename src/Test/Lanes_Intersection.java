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
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Lanes_Intersection {
	public static void main(String[] args) {

		// --------------------------------------------------------------------
		// -------------------------------Lane1--------------------------------
		// --------------------------------------------------------------------

		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Lanes Intersection";

		DataString green = new DataString();
		green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.PlaceList.add(green);

		DataCar p1 = new DataCar();
		p1.SetName("P_a1");
		pn.PlaceList.add(p1);

		DataCarQueue p2 = new DataCarQueue();
		p2.Value.Size = 10;
		p2.SetName("P_x1");
		pn.PlaceList.add(p2);

		DataString p3 = new DataString();
		p3.SetName("P_TL1");
		pn.PlaceList.add(p3);

		DataCar p4 = new DataCar();
		p4.SetName("P_b1");
		pn.PlaceList.add(p4);

		// -------------------------------------------------------------------------------------
		// --------------------------------Lane 2-----------------------------------------------
		// -------------------------------------------------------------------------------------

		DataCar p5 = new DataCar(); //p5.Printable = false;
		p5.SetName("P_a2");
		pn.PlaceList.add(p5);

		DataCarQueue p6 = new DataCarQueue(); //p6.Printable = false;
		p6.Value.Size = 3;
		p6.SetName("P_x2");
		pn.PlaceList.add(p6);

		DataString p7 = new DataString(); //p7.Printable = false;
		p7.SetName("P_TL2");
		pn.PlaceList.add(p7);

		DataCar p8 = new DataCar(); //p8.Printable = false;
		p8.SetName("P_b2");
		pn.PlaceList.add(p8);

		// -------------------------------------------------------------------------------------
		// --------------------------------Lane 3-----------------------------------------------
		// -------------------------------------------------------------------------------------

		DataCar p9 = new DataCar(); //p9.Printable = false;
		p9.SetName("P_a3");
		pn.PlaceList.add(p9);

		DataCarQueue p10 = new DataCarQueue(); //p10.Printable = false;
		p10.Value.Size = 3;
		p10.SetName("P_x3");
		pn.PlaceList.add(p10);

		DataString p11 = new DataString(); //p11.Printable = false;
		p11.SetName("P_TL3");
		pn.PlaceList.add(p11);

		DataCar p12 = new DataCar(); //p12.Printable = false;
		p12.SetName("P_b3");
		pn.PlaceList.add(p12);

		// -------------------------------------------------------------------------------------
		// --------------------------------Lane 4-----------------------------------------------
		// -------------------------------------------------------------------------------------

		DataCar p13 = new DataCar();
		p13.SetName("P_a4");
		pn.PlaceList.add(p13);

		DataCarQueue p14 = new DataCarQueue();
		p14.Value.Size = 3;
		p14.SetName("P_x4");
		pn.PlaceList.add(p14);

		DataString p15 = new DataString();
		p15.SetName("P_TL4");
		pn.PlaceList.add(p15);
// p
//		DataCar p16 = new DataCar();
//		p16.SetName("P_b4");
//		pn.PlaceList.add(p16);

		DataCarQueue p26 = new DataCarQueue();
		p26.Value.Size = 3;
		p26.SetName("P_x5");
		pn.PlaceList.add(p26);

		DataString p27 = new DataString();
		p27.SetName("P_TL5");
		pn.PlaceList.add(p27);
// p
		DataCar p28 = new DataCar();
		p28.SetName("P_b5");
		
		pn.PlaceList.add(p28);
		// -------------------------------------------------------------------------------------
				// --------------------------------Lane 6-----------------------------------------------
				// -------------------------------------------------------------------------------------

				DataCar p30 = new DataCar(); //p9.Printable = false;
				p30.SetName("P_a6");
				pn.PlaceList.add(p30);

				DataCarQueue p31 = new DataCarQueue(); //p10.Printable = false;
				p31.Value.Size = 3;
				p31.SetName("P_x6");
				pn.PlaceList.add(p31);

				DataString p32 = new DataString(); //p11.Printable = false;
				p32.SetName("P_TL6");
				pn.PlaceList.add(p32);

				DataCar p33 = new DataCar(); //p12.Printable = false;
				p33.SetName("P_b6");
				pn.PlaceList.add(p33);
				
				// -------------------------------------------------------------------------------------
				// --------------------------------Lane 7-----------------------------------------------
				// -------------------------------------------------------------------------------------

				DataCar p43 = new DataCar(); //p9.Printable = false;
				p43.SetName("P_a7");
				pn.PlaceList.add(p43);

				DataCarQueue p44 = new DataCarQueue(); //p10.Printable = false;
				p44.Value.Size = 3;
				p4.SetName("P_x7");
				pn.PlaceList.add(p44);

				DataString p45 = new DataString(); //p11.Printable = false;
				p45.SetName("P_TL7");
				pn.PlaceList.add(p45);

				DataCar p46 = new DataCar(); //p12.Printable = false;
				p46.SetName("P_b7");
				pn.PlaceList.add(p46);

				// -------------------------------------------------------------------------------------
				// --------------------------------Lane 8-----------------------------------------------
				// -------------------------------------------------------------------------------------

				DataCar p47 = new DataCar(); //p9.Printable = false;
				p47.SetName("P_a8");
				pn.PlaceList.add(p8);

				DataCarQueue p48 = new DataCarQueue(); //p10.Printable = false;
				p48 .Value.Size = 3;
				p48.SetName("P_x8");
				pn.PlaceList.add(p48);

				DataString p49 = new DataString(); //p11.Printable = false;
				p49.SetName("P_TL8");
				pn.PlaceList.add(p49);

				DataCar p50 = new DataCar(); //p12.Printable = false;
				p50.SetName("P_b8");
				pn.PlaceList.add(p50);
				
				// -------------------------------------------------------------------------------------
				// --------------------------------Lane 9-----------------------------------------------
				// -------------------------------------------------------------------------------------

				DataCar p36 = new DataCar();
				p36.SetName("P_a9");
				pn.PlaceList.add(p36);

				DataCarQueue p38 = new DataCarQueue();
				p38.Value.Size = 3;
				p38.SetName("P_x9");
				pn.PlaceList.add(p38);

				DataString p37 = new DataString();
				p37.SetName("P_TL9");
				pn.PlaceList.add(p37);
		// p
//				DataCar p16 = new DataCar();
//				p16.SetName("P_b4");
//				pn.PlaceList.add(p16);

				DataCarQueue p39 = new DataCarQueue();
				p39.Value.Size = 3;
				p39.SetName("P_x10");
				pn.PlaceList.add(p39);

				DataString p40 = new DataString();
				p40.SetName("P_TL10");
				pn.PlaceList.add(p40);
		// p
				DataCar p41 = new DataCar();
				p41.SetName("P_b10");
				
				pn.PlaceList.add(p41);


		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 1-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p17 = new DataCarQueue(); p17.Printable = false;
		p17.Value.Size = 3;
		p17.SetName("P_o1");
		pn.PlaceList.add(p17);

		DataCar p18 = new DataCar(); p18.Printable = false;
		p18.SetName("P_o1Exit");
		pn.PlaceList.add(p18);

		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 2-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p19 = new DataCarQueue(); p19.Printable = false;
		p19.Value.Size = 3;
		p19.SetName("P_o2");
		pn.PlaceList.add(p19);

		DataCar p20 = new DataCar(); p20.Printable = false;
		p20.SetName("P_o2Exit");
		pn.PlaceList.add(p20);

		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 3-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p21 = new DataCarQueue(); p21.Printable = false;
		p21.Value.Size = 3;
		p21.SetName("P_o3");
		pn.PlaceList.add(p21);

		DataCar p22 = new DataCar(); p22.Printable = false;
		p22.SetName("P_o3Exit");
		pn.PlaceList.add(p22);
		
		// ----------------------------------------------------------------------------
				// ----------------------------Exit lane 6-------------------------------------
				// ----------------------------------------------------------------------------

				DataCarQueue p34 = new DataCarQueue(); p34.Printable = false;
				p34.Value.Size = 3;
				p34.SetName("P_o6");
				pn.PlaceList.add(p34);

				DataCar p35 = new DataCar(); p35.Printable = false;
				p35.SetName("P_o6Exit");
				pn.PlaceList.add(p35);

				// ----------------------------------------------------------------------------
				// ----------------------------Exit lane 7-------------------------------------
				// ----------------------------------------------------------------------------

				DataCarQueue p52 = new DataCarQueue(); p52.Printable = false;
				p52.Value.Size = 3;
				p52.SetName("P_o7");
				pn.PlaceList.add(p52);

				DataCar p51 = new DataCar(); p51.Printable = false;
				p51.SetName("P_o7Exit");
				pn.PlaceList.add(p51);
		
				// ----------------------------------------------------------------------------
				// ----------------------------Exit lane 8-------------------------------------
				// ----------------------------------------------------------------------------

				DataCarQueue p54 = new DataCarQueue(); p54.Printable = false;
				p54.Value.Size = 3;
				p54.SetName("P_o8");
				pn.PlaceList.add(p54);

				DataCar p53 = new DataCar(); p53.Printable = false;
				p53.SetName("P_o8Exit");
				pn.PlaceList.add(p53);

		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersection-----------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue p25 = new DataCarQueue();
		p25.Value.Size = 3;
		p25.SetName("P_I");
		pn.PlaceList.add(p25);

		DataCarQueue p29 = new DataCarQueue();
		p29.Value.Size = 3;
		p29.SetName("P_I2");
		pn.PlaceList.add(p29);
		
		DataCarQueue p42 = new DataCarQueue();
		p42.Value.Size = 3;
		p42.SetName("P_I3");
		pn.PlaceList.add(p42);
		
		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T_u1";
		t1.InputPlaceName.add("P_a1");

		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition = T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
		t1.GuardMappingList.add(grdT1);

		t1.Delay = 0;
		pn.Transitions.add(t1);
		

		// T2 ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T_e1";
		t2.InputPlaceName.add("P_x1");
		t2.InputPlaceName.add("P_TL1");

		Condition T2Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal, "green");
		Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;
		grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
	    grdT2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));
	    
		t2.GuardMappingList.add(grdT2);

//		t2.Delay = 3;
		pn.Transitions.add(t2);

		// T3 ------------------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T_u2";
		t3.InputPlaceName.add("P_a2");

		Condition T3Ct1 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
		Condition T3Ct2 = new Condition(t1, "P_x2", TransitionCondition.CanAddCars);
		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;
		grdT3.Activations.add(new Activation(t3, "P_a2", TransitionOperation.AddElement, "P_x2"));
		t3.GuardMappingList.add(grdT3);

		t3.Delay = 0;
		pn.Transitions.add(t3);

		// T4 ------------------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T_e2";
		t4.InputPlaceName.add("P_x2");
		t4.InputPlaceName.add("P_TL2");

		Condition T4Ct1 = new Condition(t4, "P_TL2", TransitionCondition.Equal, "green");
		Condition T4Ct2 = new Condition(t4, "P_x2", TransitionCondition.HaveCar);
		T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b2"));
		grdT4.Activations.add(new Activation(t4, "P_TL2", TransitionOperation.Move, "P_TL2"));
		t4.GuardMappingList.add(grdT4);

		t4.Delay = 0;
		pn.Transitions.add(t4);

		// T5 ------------------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T_u3";
		t5.InputPlaceName.add("P_a3");

		Condition T5Ct1 = new Condition(t5, "P_a3", TransitionCondition.NotNull);
		Condition T5Ct2 = new Condition(t5, "P_x3", TransitionCondition.CanAddCars);
		T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition = T5Ct1;
		grdT5.Activations.add(new Activation(t5, "P_a3", TransitionOperation.AddElement, "P_x3"));
		t5.GuardMappingList.add(grdT5);

		t5.Delay = 0;
		pn.Transitions.add(t5);

		// T6 ------------------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T_e3";
		t6.InputPlaceName.add("P_x3");
		t6.InputPlaceName.add("P_TL3");

		Condition T6Ct1 = new Condition(t6, "P_TL3", TransitionCondition.Equal, "green");
		Condition T6Ct2 = new Condition(t6, "P_x3", TransitionCondition.HaveCar);
		T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

		GuardMapping grdT6 = new GuardMapping();
		grdT6.condition = T6Ct1;
		grdT6.Activations.add(new Activation(t6, "P_x3", TransitionOperation.PopElementWithoutTarget, "P_b3"));
		grdT6.Activations.add(new Activation(t6, "P_TL3", TransitionOperation.Move, "P_TL3"));
		t6.GuardMappingList.add(grdT6);

		t6.Delay = 0;
		pn.Transitions.add(t6);

		// T7 ------------------------------------------------
		PetriTransition t7 = new PetriTransition(pn);
		t7.TransitionName = "T_u4";
		t7.InputPlaceName.add("P_a4");

		Condition T7Ct1 = new Condition(t7, "P_a4", TransitionCondition.NotNull);
		Condition T7Ct2 = new Condition(t7, "P_I", TransitionCondition.CanAddCars);
		T7Ct1.SetNextCondition(LogicConnector.AND, T7Ct2);

		GuardMapping grdT7 = new GuardMapping();
		grdT7.condition = T7Ct1;
		grdT7.Activations.add(new Activation(t7, "P_a4", TransitionOperation.AddElement, "P_I"));
		t7.GuardMappingList.add(grdT7);

		t7.Delay = 0;
		pn.Transitions.add(t7);

		// T8 ------------------------------------------------
		PetriTransition t8 = new PetriTransition(pn);
		t8.TransitionName = "T_e4";
		t8.InputPlaceName.add("P_x4");
		t8.InputPlaceName.add("P_TL4");

		Condition T8Ct1 = new Condition(t8, "P_TL4", TransitionCondition.Equal, "green");
		Condition T8Ct2 = new Condition(t8, "P_x4", TransitionCondition.HaveCar);
		T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

		GuardMapping grdT8 = new GuardMapping();
		grdT8.condition = T8Ct1;
		grdT8.Activations.add(new Activation(t8, "P_x4", TransitionOperation.PopElementWithoutTarget, "P_a4"));
		grdT8.Activations.add(new Activation(t8, "P_TL4", TransitionOperation.Move, "P_TL4"));
		t8.GuardMappingList.add(grdT8);

		t8.Delay = 0;
		pn.Transitions.add(t8);

		// T9----------------------------------------------------------------

		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T_g1Exit";
		t9.InputPlaceName.add("P_o1");

		Condition T9Ct1 = new Condition(t9, "P_o1", TransitionCondition.HaveCar);

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition = T9Ct1;
		grdT9.Activations.add(new Activation(t9, "P_o1", TransitionOperation.PopElementWithoutTarget, "P_o1Exit"));
		t9.GuardMappingList.add(grdT9);

		t9.Delay = 0;
		pn.Transitions.add(t9);

		// T10----------------------------------------------------------------

		PetriTransition t10 = new PetriTransition(pn);
		t10.TransitionName = "T_g2Exit";
		t10.InputPlaceName.add("P_o2");

		Condition T10Ct1 = new Condition(t10, "P_o2", TransitionCondition.HaveCar);

		GuardMapping grdT10 = new GuardMapping();
		grdT10.condition = T10Ct1;
		grdT10.Activations.add(new Activation(t10, "P_o2", TransitionOperation.PopElementWithoutTarget, "P_o2Exit"));
		t10.GuardMappingList.add(grdT10);

		t10.Delay = 0;
		pn.Transitions.add(t10);

		// T11----------------------------------------------------------------

		PetriTransition t11 = new PetriTransition(pn);
		t11.TransitionName = "T_g3Exit";
		t11.InputPlaceName.add("P_o3");

		Condition T11Ct1 = new Condition(t11, "P_o3", TransitionCondition.HaveCar);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition = T11Ct1;
		grdT11.Activations.add(new Activation(t11, "P_o3", TransitionOperation.PopElementWithoutTarget, "P_o3Exit"));
		t11.GuardMappingList.add(grdT11);

		t11.Delay = 0;
		pn.Transitions.add(t11);

		// T12----------------------------------------------------------------

		// --------------------------------------first part-------------------------------------------

		// T13 ------------------------------------------------
		PetriTransition t13 = new PetriTransition(pn);
		t13.TransitionName = "T_i1";
		t13.InputPlaceName.add("P_b1");

		Condition T13Ct1 = new Condition(t13, "P_b1", TransitionCondition.NotNull);
		Condition T13Ct2 = new Condition(t13, "P_I", TransitionCondition.CanAddCars);
		T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

		GuardMapping grdT13 = new GuardMapping();
		grdT13.condition = T13Ct1;
		grdT13.Activations.add(new Activation(t13, "P_b1", TransitionOperation.AddElement, "P_I"));
		t13.GuardMappingList.add(grdT13);

		t13.Delay = 0;
		pn.Transitions.add(t13);

		// T14-----------------------------------------------------------
		PetriTransition t14 = new PetriTransition(pn);
		t14.TransitionName = "T_g1";
		t14.InputPlaceName.add("P_I");

		Condition T14Ct1 = new Condition(t14, "P_I", TransitionCondition.HaveCarForMe);

		GuardMapping grdT14 = new GuardMapping();
		grdT14.condition = T14Ct1;
		grdT14.Activations.add(new Activation(t14, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o1"));
		t14.GuardMappingList.add(grdT14);

		t14.Delay = 0;
		pn.Transitions.add(t14);

		// ---------------------------------Second Part-------------------------------------------

		// T15 ------------------------------------------------
		PetriTransition t15 = new PetriTransition(pn);
		t15.TransitionName = "T_i2";
		t15.InputPlaceName.add("P_b2");

		Condition T15Ct1 = new Condition(t15, "P_b2", TransitionCondition.NotNull);
		Condition T15Ct2 = new Condition(t15, "P_I", TransitionCondition.CanAddCars);
		T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

		GuardMapping grdT15 = new GuardMapping();
		grdT15.condition = T15Ct1;
		grdT15.Activations.add(new Activation(t15, "P_b2", TransitionOperation.AddElement, "P_I"));
		t15.GuardMappingList.add(grdT15);

		t15.Delay = 0;
		pn.Transitions.add(t15);

		// T16-----------------------------------------------------------
		PetriTransition t16 = new PetriTransition(pn);
		t16.TransitionName = "T_g2";
		t16.InputPlaceName.add("P_I");

		Condition T16Ct1 = new Condition(t16, "P_I", TransitionCondition.HaveCarForMe);

		GuardMapping grdT16 = new GuardMapping();
		grdT16.condition = T16Ct1;
		grdT16.Activations.add(new Activation(t16, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o2"));
		t16.GuardMappingList.add(grdT16);

		t16.Delay = 0;
		pn.Transitions.add(t16);

		// ----------------------Third Part----------------------------------------------------------------

		// T17 ------------------------------------------------
		PetriTransition t17 = new PetriTransition(pn);
		t17.TransitionName = "T_i3";
		t17.InputPlaceName.add("P_b3");

		Condition T17Ct1 = new Condition(t17, "P_b3", TransitionCondition.NotNull);
		Condition T17Ct2 = new Condition(t17, "P_I", TransitionCondition.CanAddCars);
		T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

		GuardMapping grdT17 = new GuardMapping();
		grdT17.condition = T17Ct1;
		grdT17.Activations.add(new Activation(t17, "P_b3", TransitionOperation.AddElement, "P_I"));
		t17.GuardMappingList.add(grdT17);

		t17.Delay = 0;
		pn.Transitions.add(t17);

		// T18---------------------------------------------------------

		PetriTransition t18 = new PetriTransition(pn);
		t18.TransitionName = "T_g3";
		t18.InputPlaceName.add("P_I");

		Condition T18Ct1 = new Condition(t18, "P_I", TransitionCondition.HaveCarForMe);

		GuardMapping grdT18 = new GuardMapping();
		grdT18.condition = T18Ct1;
		grdT18.Activations.add(new Activation(t18, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o3"));
		t18.GuardMappingList.add(grdT18);

		t18.Delay = 0;
		pn.Transitions.add(t18);

		// -------------------------------------Fourth Part------------------------------------------

		// T19 ------------------------------------------------
//		PetriTransition t19 = new PetriTransition(pn);
//		t19.TransitionName = "T_i4";
//		t19.InputPlaceName.add("P_x5");
//
//		Condition T19Ct1 = new Condition(t19, "P_x5", TransitionCondition.HaveCar);
//		Condition T19Ct2 = new Condition(t19, "P_I", TransitionCondition.CanAddCars);
//		T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);
//
//		GuardMapping grdT19 = new GuardMapping();
//		grdT19.condition = T19Ct1;
//		grdT19.Activations.add(new Activation(t19, "P_x5", TransitionOperation.PopElementWithTargetToQueue, "P_I"));
//
//		t19.GuardMappingList.add(grdT19);
//
//		t19.Delay = 0;
//		pn.Transitions.add(t19);

		// T20---------------------------------------------------------

		PetriTransition t20 = new PetriTransition(pn);
		t20.TransitionName = "T_x5";
		t20.InputPlaceName.add("P_I");

		Condition T20Ct1 = new Condition(t20, "P_I", TransitionCondition.HaveCarForMe);

		GuardMapping grdT20 = new GuardMapping();
		grdT20.condition = T20Ct1;
		grdT20.Activations.add(new Activation(t20, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_x5"));
		t20.GuardMappingList.add(grdT20);

		t20.Delay = 0;
		pn.Transitions.add(t20);
		

		// T19 ------------------------------------------------
		PetriTransition t19 = new PetriTransition(pn);
		t19.TransitionName = "T_e5";
		t19.InputPlaceName.add("P_x5");
		t19.InputPlaceName.add("P_TL5");

		Condition T19Ct1 = new Condition(t19, "P_TL5", TransitionCondition.Equal, "green");
		Condition T19Ct2 = new Condition(t19, "P_x5", TransitionCondition.HaveCar);
		T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);

		GuardMapping grdT19 = new GuardMapping();
		grdT19.condition = T19Ct1;
		grdT19.Activations.add(new Activation(t19, "P_x5", TransitionOperation.PopElementWithoutTarget, "P_b5"));
		grdT19.Activations.add(new Activation(t19, "P_TL5", TransitionOperation.Move, "P_TL5"));
		t19.GuardMappingList.add(grdT19);

		t19.Delay = 0;
		pn.Transitions.add(t19);
		
		// T21---------------------------------------------------------

				PetriTransition t21 = new PetriTransition(pn);
				t21.TransitionName = "T_x4";
				t21.InputPlaceName.add("P_I2");

				Condition T21Ct1 = new Condition(t21, "P_I2", TransitionCondition.HaveCarForMe);

				GuardMapping grdT21 = new GuardMapping();
				grdT21.condition = T21Ct1;
				grdT21.Activations.add(new Activation(t21, "P_I2", TransitionOperation.PopElementWithTargetToQueue, "P_x4"));
				t21.GuardMappingList.add(grdT21);

				t21.Delay = 0;
				pn.Transitions.add(t21);
				
				// T22 ------------------------------------------------
				PetriTransition t22 = new PetriTransition(pn);
				t22.TransitionName = "T_i5";
				t22.InputPlaceName.add("P_b5");

				Condition T22Ct1 = new Condition(t22, "P_b5", TransitionCondition.NotNull);
				Condition T22Ct2 = new Condition(t22, "P_I2", TransitionCondition.CanAddCars);
				T22Ct1.SetNextCondition(LogicConnector.AND, T22Ct2);

				GuardMapping grdT22 = new GuardMapping();
				grdT22.condition = T22Ct1;
				grdT22.Activations.add(new Activation(t22, "P_b5", TransitionOperation.AddElement, "P_I2"));
				t22.GuardMappingList.add(grdT22);

				t22.Delay = 0;
				pn.Transitions.add(t22);
				
				// T23 ------------------------------------------------
				PetriTransition t23 = new PetriTransition(pn);
				t23.TransitionName = "T_u6";
				t23.InputPlaceName.add("P_a6");

				Condition T23Ct1 = new Condition(t23, "P_a6", TransitionCondition.NotNull);
				Condition T23Ct2 = new Condition(t23, "P_x6", TransitionCondition.CanAddCars);
				T23Ct1.SetNextCondition(LogicConnector.AND, T23Ct2);

				GuardMapping grdT23 = new GuardMapping();
				grdT23.condition = T23Ct1;
				grdT23.Activations.add(new Activation(t23, "P_a6", TransitionOperation.AddElement, "P_x6"));
				t23.GuardMappingList.add(grdT23);

				t23.Delay = 0;
				pn.Transitions.add(t23);
				
				// T33 ------------------------------------------------
				PetriTransition t33 = new PetriTransition(pn);
				t33.TransitionName = "T_u7";
				t33.InputPlaceName.add("P_a7");

				Condition T33Ct1 = new Condition(t33, "P_a7", TransitionCondition.NotNull);
				Condition T33Ct2 = new Condition(t33, "P_x7", TransitionCondition.CanAddCars);
				T33Ct1.SetNextCondition(LogicConnector.AND, T33Ct2);

				GuardMapping grdT33 = new GuardMapping();
				grdT33.condition = T33Ct1;
				grdT33.Activations.add(new Activation(t33, "P_a7", TransitionOperation.AddElement, "P_x7"));
				t33.GuardMappingList.add(grdT33);

				t33.Delay = 0;
				pn.Transitions.add(t33);
				
				// T38 ------------------------------------------------
				PetriTransition t38 = new PetriTransition(pn);
				t38.TransitionName = "T_u8";
				t38.InputPlaceName.add("P_a8");

				Condition T38Ct1 = new Condition(t38, "P_a8", TransitionCondition.NotNull);
				Condition T38Ct2 = new Condition(t38, "P_x8", TransitionCondition.CanAddCars);
				T38Ct1.SetNextCondition(LogicConnector.AND, T38Ct2);

				GuardMapping grdT38 = new GuardMapping();
				grdT38.condition = T38Ct1;
				grdT38.Activations.add(new Activation(t38, "P_a8", TransitionOperation.AddElement, "P_x8"));
				t38.GuardMappingList.add(grdT38);

				t38.Delay = 0;
				pn.Transitions.add(t38);
				
				// T24 ------------------------------------------------
				PetriTransition t24 = new PetriTransition(pn);
				t24.TransitionName = "T_e6";
				t24.InputPlaceName.add("P_x6");
				t24.InputPlaceName.add("P_TL6");

				Condition T24Ct1 = new Condition(t24, "P_TL6", TransitionCondition.Equal, "green");
				Condition T24Ct2 = new Condition(t24, "P_x6", TransitionCondition.HaveCar);
				T24Ct1.SetNextCondition(LogicConnector.AND, T24Ct2);

				GuardMapping grdT24 = new GuardMapping();
				grdT24.condition = T24Ct1;
				grdT24.Activations.add(new Activation(t24, "P_x6", TransitionOperation.PopElementWithoutTarget, "P_b6"));
			    grdT24.Activations.add(new Activation(t24, "P_TL6", TransitionOperation.Move, "P_TL6"));
			    
				t24.GuardMappingList.add(grdT24);
				
				// T34 ------------------------------------------------
				PetriTransition t34 = new PetriTransition(pn);
				t34.TransitionName = "T_e7";
				t34.InputPlaceName.add("P_x7");
				t34.InputPlaceName.add("P_TL7");

				Condition T34Ct1 = new Condition(t34, "P_TL7", TransitionCondition.Equal, "green");
				Condition T34Ct2 = new Condition(t34, "P_x7", TransitionCondition.HaveCar);
				T34Ct1.SetNextCondition(LogicConnector.AND, T34Ct2);

				GuardMapping grdT34 = new GuardMapping();
				grdT34.condition = T34Ct1;
				grdT34.Activations.add(new Activation(t34, "P_x7", TransitionOperation.PopElementWithoutTarget, "P_b7"));
			    grdT34.Activations.add(new Activation(t34, "P_TL7", TransitionOperation.Move, "P_TL7"));
			    
				t34.GuardMappingList.add(grdT34);
				
				// T39 ------------------------------------------------
				PetriTransition t39 = new PetriTransition(pn);
				t39.TransitionName = "T_e8";
				t39.InputPlaceName.add("P_x8");
				t39.InputPlaceName.add("P_TL8");

				Condition T39Ct1 = new Condition(t39, "P_TL8", TransitionCondition.Equal, "green");
				Condition T39Ct2 = new Condition(t39, "P_x8", TransitionCondition.HaveCar);
				T39Ct1.SetNextCondition(LogicConnector.AND, T39Ct2);

				GuardMapping grdT39 = new GuardMapping();
				grdT39.condition = T39Ct1;
				grdT39.Activations.add(new Activation(t39, "P_x8", TransitionOperation.PopElementWithoutTarget, "P_b8"));
			    grdT39.Activations.add(new Activation(t39, "P_TL8", TransitionOperation.Move, "P_TL8"));
			    
				t39.GuardMappingList.add(grdT39);
				
				// T12 ------------------------------------------------
				PetriTransition t12 = new PetriTransition(pn);
				t12.TransitionName = "T_i6";
				t12.InputPlaceName.add("P_b6");

				Condition T12Ct1 = new Condition(t12, "P_b6", TransitionCondition.NotNull);
				Condition T12Ct2 = new Condition(t12, "P_I2", TransitionCondition.CanAddCars);
				T12Ct1.SetNextCondition(LogicConnector.AND, T12Ct2);

				GuardMapping grdT12 = new GuardMapping();
				grdT12.condition = T12Ct1;
				grdT12.Activations.add(new Activation(t12, "P_b6", TransitionOperation.AddElement, "P_I2"));
				t12.GuardMappingList.add(grdT12);

				t12.Delay = 0;
				pn.Transitions.add(t12);
				
				// T35 ------------------------------------------------
				PetriTransition t35 = new PetriTransition(pn);
				t35.TransitionName = "T_i7";
				t35.InputPlaceName.add("P_b7");

				Condition T35Ct1 = new Condition(t35, "P_b7", TransitionCondition.NotNull);
				Condition T35Ct2 = new Condition(t35, "P_I3", TransitionCondition.CanAddCars);
				T35Ct1.SetNextCondition(LogicConnector.AND, T35Ct2);

				GuardMapping grdT35 = new GuardMapping();
				grdT35.condition = T35Ct1;
				grdT35.Activations.add(new Activation(t35, "P_b7", TransitionOperation.AddElement, "P_I3"));
				t35.GuardMappingList.add(grdT35);

				t35.Delay = 0;
				pn.Transitions.add(t35);
				
				// T40 ------------------------------------------------
				PetriTransition t40 = new PetriTransition(pn);
				t40.TransitionName = "T_i8";
				t40.InputPlaceName.add("P_b8");

				Condition T40Ct1 = new Condition(t40, "P_b8", TransitionCondition.NotNull);
				Condition T40Ct2 = new Condition(t40, "P_3", TransitionCondition.CanAddCars);
				T40Ct1.SetNextCondition(LogicConnector.AND, T40Ct2);

				GuardMapping grdT40 = new GuardMapping();
				grdT40.condition = T40Ct1;
				grdT40.Activations.add(new Activation(t40, "P_b8", TransitionOperation.AddElement, "P_I3"));
				t40.GuardMappingList.add(grdT40);

				t40.Delay = 0;
				pn.Transitions.add(t40);
				
				// T26----------------------------------------------------------------

				PetriTransition t26 = new PetriTransition(pn);
				t26.TransitionName = "T_g6Exit";
				t26.InputPlaceName.add("P_o6");

				Condition T26Ct1 = new Condition(t26, "P_o6", TransitionCondition.HaveCar);

				GuardMapping grdT26 = new GuardMapping();
				grdT26.condition = T26Ct1;
				grdT26.Activations.add(new Activation(t26, "P_o6", TransitionOperation.PopElementWithoutTarget, "P_o6Exit"));
				t26.GuardMappingList.add(grdT26);

				t26.Delay = 0;
				pn.Transitions.add(t26);
				
				// T36----------------------------------------------------------------

				PetriTransition t36 = new PetriTransition(pn);
				t36.TransitionName = "T_g7Exit";
				t36.InputPlaceName.add("P_o7");

				Condition T36Ct1 = new Condition(t36, "P_o7", TransitionCondition.HaveCar);

				GuardMapping grdT36 = new GuardMapping();
				grdT36.condition = T36Ct1;
				grdT36.Activations.add(new Activation(t36, "P_o7", TransitionOperation.PopElementWithoutTarget, "P_o7Exit"));
				t36.GuardMappingList.add(grdT36);

				t36.Delay = 0;
				pn.Transitions.add(t36);
				
				
				// T41----------------------------------------------------------------

				PetriTransition t41 = new PetriTransition(pn);
				t41.TransitionName = "T_g8Exit";
				t41.InputPlaceName.add("P_o8");

				Condition T41Ct1 = new Condition(t41, "P_o8", TransitionCondition.HaveCar);

				GuardMapping grdT41 = new GuardMapping();
				grdT41.condition = T41Ct1;
				grdT41.Activations.add(new Activation(t41, "P_o8", TransitionOperation.PopElementWithoutTarget, "P_o8Exit"));
				t41.GuardMappingList.add(grdT41);

				t41.Delay = 0;
				pn.Transitions.add(t41);
				
				
				// T25-----------------------------------------------------------
				PetriTransition t25 = new PetriTransition(pn);
				t25.TransitionName = "T_g6";
				t25.InputPlaceName.add("P_I2");

				Condition T25Ct1 = new Condition(t25, "P_I2", TransitionCondition.HaveCarForMe);

				GuardMapping grdT25 = new GuardMapping();
				grdT25.condition = T25Ct1;
				grdT25.Activations.add(new Activation(t25, "P_I2", TransitionOperation.PopElementWithTargetToQueue, "P_o6"));
				t25.GuardMappingList.add(grdT25);

				t25.Delay = 0;
				pn.Transitions.add(t25);

				// T37-----------------------------------------------------------
				PetriTransition t37 = new PetriTransition(pn);
				t37.TransitionName = "T_g7";
				t37.InputPlaceName.add("P_I3");

				Condition T37Ct1 = new Condition(t37, "P_I3", TransitionCondition.HaveCarForMe);

				GuardMapping grdT37 = new GuardMapping();
				grdT37.condition = T37Ct1;
				grdT37.Activations.add(new Activation(t37, "P_I3", TransitionOperation.PopElementWithTargetToQueue, "P_o7"));
				t37.GuardMappingList.add(grdT37);

				t37.Delay = 0;
				pn.Transitions.add(t37);
				
				// T42-----------------------------------------------------------
				PetriTransition t42 = new PetriTransition(pn);
				t42.TransitionName = "T_g8";
				t42.InputPlaceName.add("P_I3");

				Condition T42Ct1 = new Condition(t42, "P_I3", TransitionCondition.HaveCarForMe);

				GuardMapping grdT42 = new GuardMapping();
				grdT42.condition = T42Ct1;
				grdT42.Activations.add(new Activation(t42, "P_I3", TransitionOperation.PopElementWithTargetToQueue, "P_o8"));
				t42.GuardMappingList.add(grdT42);

				t42.Delay = 0;
				pn.Transitions.add(t42);
				
				// T29---------------------------------------------------------

				PetriTransition t29 = new PetriTransition(pn);
				t29.TransitionName = "T_x9";
				t29.InputPlaceName.add("P_I3");

				Condition T29Ct1 = new Condition(t29, "P_I3", TransitionCondition.HaveCarForMe);

				GuardMapping grdT29 = new GuardMapping();
				grdT29.condition = T29Ct1;
				grdT29.Activations.add(new Activation(t29, "P_I3", TransitionOperation.PopElementWithTargetToQueue, "P_x9"));
				t29.GuardMappingList.add(grdT29);

				t29.Delay = 0;
				pn.Transitions.add(t29);
				
				// T30---------------------------------------------------------

				PetriTransition t30 = new PetriTransition(pn);
				t30.TransitionName = "T_x10";
				t30.InputPlaceName.add("P_I2");

				Condition T30Ct1 = new Condition(t30, "P_I2", TransitionCondition.HaveCarForMe);

				GuardMapping grdT30 = new GuardMapping();
				grdT30.condition = T30Ct1;
				grdT30.Activations.add(new Activation(t30, "P_I2", TransitionOperation.PopElementWithTargetToQueue, "P_x10"));
				t30.GuardMappingList.add(grdT30);

				t30.Delay = 0;
				pn.Transitions.add(t30);
				
				// T31 ------------------------------------------------
				PetriTransition t31 = new PetriTransition(pn);
				t31.TransitionName = "T_e10";
				t31.InputPlaceName.add("P_x10");
				t31.InputPlaceName.add("P_TL10");

				Condition T31Ct1 = new Condition(t31, "P_TL10", TransitionCondition.Equal, "green");
				Condition T31Ct2 = new Condition(t31, "P_x10", TransitionCondition.HaveCar);
				T31Ct1.SetNextCondition(LogicConnector.AND, T31Ct2);

				GuardMapping grdT31 = new GuardMapping();
				grdT31.condition = T31Ct1;
				grdT31.Activations.add(new Activation(t31, "P_x10", TransitionOperation.PopElementWithoutTarget, "P_a10"));
				grdT31.Activations.add(new Activation(t31, "P_TL10", TransitionOperation.Move, "P_TL10"));
				t31.GuardMappingList.add(grdT31);

				t31.Delay = 0;
				pn.Transitions.add(t31);
				
				// T28 ------------------------------------------------
				PetriTransition t28 = new PetriTransition(pn);
				t28.TransitionName = "T_e9";
				t28.InputPlaceName.add("P_x9");
				t28.InputPlaceName.add("P_TL9");

				Condition T28Ct1 = new Condition(t28, "P_TL9", TransitionCondition.Equal, "green");
				Condition T28Ct2 = new Condition(t28, "P_x9", TransitionCondition.HaveCar);
				T28Ct1.SetNextCondition(LogicConnector.AND, T28Ct2);

				GuardMapping grdT28 = new GuardMapping();
				grdT28.condition = T28Ct1;
				grdT28.Activations.add(new Activation(t28, "P_x9", TransitionOperation.PopElementWithoutTarget, "P_9"));
				grdT28.Activations.add(new Activation(t28, "P_TL9", TransitionOperation.Move, "P_TL9"));
				t28.GuardMappingList.add(grdT28);

				t28.Delay = 0;
				pn.Transitions.add(t28);
				
				// T27 ------------------------------------------------
				PetriTransition t27 = new PetriTransition(pn);
				t27.TransitionName = "T_u9";
				t27.InputPlaceName.add("P_a9");

				Condition T27Ct1 = new Condition(t27, "P_a9", TransitionCondition.NotNull);
				Condition T27Ct2 = new Condition(t27, "P_I2", TransitionCondition.CanAddCars);
				T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct2);

				GuardMapping grdT27 = new GuardMapping();
				grdT27.condition = T27Ct1;
				grdT27.Activations.add(new Activation(t27, "P_a9", TransitionOperation.AddElement, "P_I2"));
				t27.GuardMappingList.add(grdT27);

				t27.Delay = 0;
				pn.Transitions.add(t27);
				
				// T32 ------------------------------------------------
				PetriTransition t32 = new PetriTransition(pn);
				t32.TransitionName = "T_u10";
				t32.InputPlaceName.add("P_a10");

				Condition T32Ct1 = new Condition(t32, "P_a10", TransitionCondition.NotNull);
				Condition T32Ct2 = new Condition(t32, "P_I3", TransitionCondition.CanAddCars);
				T32Ct1.SetNextCondition(LogicConnector.AND, T32Ct2);

				GuardMapping grdT32 = new GuardMapping();
				grdT32.condition = T32Ct1;
				grdT32.Activations.add(new Activation(t32, "P_a10", TransitionOperation.AddElement, "P_I3"));
				t32.GuardMappingList.add(grdT32);

				t32.Delay = 0;
				pn.Transitions.add(t32);
				
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
