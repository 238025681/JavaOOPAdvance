/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob09_CollectionHierarchy.interfaces;

import java.util.List;

/**
 *
 * @author chobi
 */
public interface Removeable extends Addable{
    List<String> remove(int index);
    
}
