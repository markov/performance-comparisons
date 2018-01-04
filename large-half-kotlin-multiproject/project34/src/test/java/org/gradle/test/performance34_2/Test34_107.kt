package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_107 {
    private val production = Production34_107("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}