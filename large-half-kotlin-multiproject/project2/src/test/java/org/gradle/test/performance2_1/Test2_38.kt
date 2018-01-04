package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_38 {
    private val production = Production2_38("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}