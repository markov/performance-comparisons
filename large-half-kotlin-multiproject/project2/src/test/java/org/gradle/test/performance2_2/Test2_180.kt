package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_180 {
    private val production = Production2_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}