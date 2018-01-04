package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_387 {
    private val production = Production9_387("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}