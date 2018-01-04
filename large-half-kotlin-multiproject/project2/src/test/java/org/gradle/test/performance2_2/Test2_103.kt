package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_103 {
    private val production = Production2_103("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}