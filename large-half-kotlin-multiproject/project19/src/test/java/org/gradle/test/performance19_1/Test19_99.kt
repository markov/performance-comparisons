package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_99 {
    private val production = Production19_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}