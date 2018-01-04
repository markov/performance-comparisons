package org.gradle.test.performance2_3

import org.junit.Assert.*

class Test2_254 {
    private val production = Production2_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}