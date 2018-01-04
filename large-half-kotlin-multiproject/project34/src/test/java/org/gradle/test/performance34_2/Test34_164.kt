package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_164 {
    private val production = Production34_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}