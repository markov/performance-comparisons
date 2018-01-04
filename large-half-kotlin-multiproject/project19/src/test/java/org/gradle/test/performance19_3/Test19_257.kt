package org.gradle.test.performance19_3

import org.junit.Assert.*

class Test19_257 {
    private val production = Production19_257("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}