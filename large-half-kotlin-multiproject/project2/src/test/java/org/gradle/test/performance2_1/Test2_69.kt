package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_69 {
    private val production = Production2_69("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}