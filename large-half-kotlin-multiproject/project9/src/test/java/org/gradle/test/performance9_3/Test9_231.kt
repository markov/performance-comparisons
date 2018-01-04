package org.gradle.test.performance9_3

import org.junit.Assert.*

class Test9_231 {
    private val production = Production9_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}