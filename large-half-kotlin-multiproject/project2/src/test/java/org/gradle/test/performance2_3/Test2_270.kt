package org.gradle.test.performance2_3

import org.junit.Assert.*

class Test2_270 {
    private val production = Production2_270("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}