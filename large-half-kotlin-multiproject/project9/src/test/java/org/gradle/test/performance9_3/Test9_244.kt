package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_244 {
    private val production = Production9_244("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}