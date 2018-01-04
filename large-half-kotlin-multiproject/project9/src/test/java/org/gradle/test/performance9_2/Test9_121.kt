package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_121 {
    private val production = Production9_121("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}