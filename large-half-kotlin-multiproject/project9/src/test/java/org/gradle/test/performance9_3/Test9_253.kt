package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_253 {
    private val production = Production9_253("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}