package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_414 {
    private val production = Production9_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}