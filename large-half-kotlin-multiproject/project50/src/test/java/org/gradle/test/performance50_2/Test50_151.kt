package org.gradle.test.performance50_2

import org.junit.Assert.*

class Test50_151 {
    private val production = Production50_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
