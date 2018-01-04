package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_344 {
    private val production = Production2_344("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}