package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_247 {
    private val production = Production9_247("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}