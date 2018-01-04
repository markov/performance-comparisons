package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_171 {
    private val production = Production2_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}