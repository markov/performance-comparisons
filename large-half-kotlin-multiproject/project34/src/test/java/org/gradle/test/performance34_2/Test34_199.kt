package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_199 {
    private val production = Production34_199("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}