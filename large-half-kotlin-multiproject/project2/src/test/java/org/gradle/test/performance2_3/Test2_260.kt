package org.gradle.test.performance2_3

import org.junit.Assert.*

class Test2_260 {
    private val production = Production2_260("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}