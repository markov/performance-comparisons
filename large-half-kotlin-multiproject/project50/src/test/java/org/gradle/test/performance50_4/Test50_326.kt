package org.gradle.test.performance50_4

import org.junit.Assert.*

class Test50_326 {
    private val production = Production50_326("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
