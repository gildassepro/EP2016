/**
 * LanguageServicewsEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sepro.parameterweb.serviceapi;

public interface LanguageServicewsEndpoint extends java.rmi.Remote {
    public org.sepro.parameterweb.serviceapi.LanguageDto[] searchLanguageServicews(org.sepro.parameterweb.serviceapi.LanguageDto languageDto) throws java.rmi.RemoteException;
    public org.sepro.parameterweb.serviceapi.LanguageDto[] getPageAllLanguageServicews(int page, int pageSize) throws java.rmi.RemoteException;
    public org.sepro.parameterweb.serviceapi.LanguageDto[] searchPageLanguageServicews(org.sepro.parameterweb.serviceapi.LanguageDto languageDto, int page, int pageSize) throws java.rmi.RemoteException;
    public org.sepro.parameterweb.serviceapi.LanguageDto updateLanguageServicews(org.sepro.parameterweb.serviceapi.LanguageDto languageDto) throws java.rmi.RemoteException;
    public void deleteLanguageServicews(org.sepro.parameterweb.serviceapi.LanguageDto languageDto) throws java.rmi.RemoteException;
    public org.sepro.parameterweb.serviceapi.LanguageDto createLanguageServicews(org.sepro.parameterweb.serviceapi.LanguageDto languageDto) throws java.rmi.RemoteException;
    public org.sepro.parameterweb.serviceapi.LanguageDto[] getAllLanguageServicews() throws java.rmi.RemoteException;
}
