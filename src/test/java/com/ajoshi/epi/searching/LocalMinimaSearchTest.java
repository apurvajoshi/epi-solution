package com.ajoshi.epi.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocalMinimaSearchTest {

    @Test
    public void testFindLocalMinima() throws Exception {
        int[] a = {6,5,4,3,1,4,5};
        assertEquals(LocalMinimaSearch.findLocalMinima(a),1);

        int[] b = {6,5,4,3,2,1,0};
        assertEquals(LocalMinimaSearch.findLocalMinima(b),-1);

        int[] c = {0,1,2,3,4,5,6};
        assertEquals(LocalMinimaSearch.findLocalMinima(c),-1);

        int[] d = {6,6,6,6,6,6};
        assertEquals(LocalMinimaSearch.findLocalMinima(d),-1);

        int[] e = {6,5,5,5,5,5,6};
        assertEquals(LocalMinimaSearch.findLocalMinima(e),-1);

        int[] f = {6,1,6,6,6,6,6,6,1,6};
        assertEquals(LocalMinimaSearch.findLocalMinima(f),1);
    }
}