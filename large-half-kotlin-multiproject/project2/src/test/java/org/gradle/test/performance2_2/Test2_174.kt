package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_174 {
    private val production = Production2_174("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}