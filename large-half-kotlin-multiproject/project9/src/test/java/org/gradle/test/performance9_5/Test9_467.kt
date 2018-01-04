package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_467 {
    private val production = Production9_467("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}