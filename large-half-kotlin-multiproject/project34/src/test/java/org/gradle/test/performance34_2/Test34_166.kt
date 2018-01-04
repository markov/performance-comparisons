package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_166 {
    private val production = Production34_166("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}